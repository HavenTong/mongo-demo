package com.haven.mongodemo.service.impl;

import com.haven.mongodemo.domain.Department;
import com.haven.mongodemo.repository.DepartmentRepository;
import com.haven.mongodemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author HavenTong
 * @date 2019/11/12 4:58 下午
 */
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(Department department) {
        this.departmentRepository.save(department);
        return department;
    }

    @Override
    public List<Department> listDepartments() {
        return this.departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department, String id) {
        department.setDepartmentId(id);
        this.departmentRepository.save(department);
        return department;
    }

    @Override
    public String deleteDepartment(String id) {
        this.departmentRepository.deleteById(id);
        return id;
    }

    @Override
    public List<Department> createMultiDepartments(List<Department> departments) {
        this.departmentRepository.insert(departments);
        return departments;
    }

    @Override
    public List<Department> getDepartmentByName(String name) {
        return this.departmentRepository.findDepartmentByName(name);
    }

    @Override
    public Department getDepartmentByEmployeeName(String employeeName) {
        return this.departmentRepository.findDepartmentByEmployeeName(employeeName);
    }
}
