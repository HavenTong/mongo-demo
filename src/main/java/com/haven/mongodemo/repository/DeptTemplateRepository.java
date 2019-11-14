package com.haven.mongodemo.repository;

import com.haven.mongodemo.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * @author HavenTong
 * @date 2019/11/12 5:58 下午
 */
@Repository
public class DeptTemplateRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Department department){
        mongoTemplate.save(department);
    }

    public List<Department> findAll(){
        return mongoTemplate.findAll(Department.class);
    }

    public String deleteById(String id){
        mongoTemplate.remove(new Query(where("departmentId").is(id)), Department.class);
        return id;
    }

    public List<Department> insert(List<Department> departments){
        mongoTemplate.insert(departments,Department.class);
        return departments;
    }

    public List<Department> findDepartmentByName(String name){
        return mongoTemplate.find(new Query(where("name").is(name)), Department.class);
    }

    public Department findDepartmentByEmployeeName(String employeeName){
        return mongoTemplate.findOne(new Query(where("employees.name").is(employeeName)), Department.class);
    }

}
