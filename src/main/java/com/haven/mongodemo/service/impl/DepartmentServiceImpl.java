package com.haven.mongodemo.service.impl;

import com.haven.mongodemo.domain.Department;
import com.haven.mongodemo.repository.DepartmentRepository;
import com.haven.mongodemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
