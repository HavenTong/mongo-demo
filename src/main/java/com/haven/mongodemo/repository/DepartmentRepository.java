package com.haven.mongodemo.repository;

import com.haven.mongodemo.domain.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HavenTong
 * @date 2019/11/12 4:55 下午
 */
@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {
    List<Department> findDepartmentByName(String name);

    @Query(value = "{'employees.name': ?0}", fields = "{'employees': 0}")
    Department findDepartmentByEmployeeName(String employeeName);
}
