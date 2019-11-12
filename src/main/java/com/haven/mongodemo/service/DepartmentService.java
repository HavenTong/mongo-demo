package com.haven.mongodemo.service;

import com.haven.mongodemo.domain.Department;

import java.util.List;

/**
 * @author HavenTong
 * @date 2019/11/12 4:57 下午
 */
public interface DepartmentService {

    public Department createDepartment(Department department);

    public List<Department> listDepartments();

}
