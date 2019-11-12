package com.haven.mongodemo.service;

import com.haven.mongodemo.domain.Department;

import java.util.List;

/**
 * @author HavenTong
 * @date 2019/11/12 4:57 下午
 */
public interface DepartmentService {

     Department createDepartment(Department department);

     List<Department> listDepartments();

     Department updateDepartment(Department department, String id);

     String deleteDepartment(String id);

     List<Department> createMultiDepartments(List<Department> departments);
}
