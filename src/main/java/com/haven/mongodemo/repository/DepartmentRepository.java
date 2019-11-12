package com.haven.mongodemo.repository;

import com.haven.mongodemo.domain.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HavenTong
 * @date 2019/11/12 4:55 下午
 */
@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
