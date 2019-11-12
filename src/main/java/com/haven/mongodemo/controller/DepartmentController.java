package com.haven.mongodemo.controller;

import com.haven.mongodemo.domain.Department;
import com.haven.mongodemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author HavenTong
 * @date 2019/11/12 4:59 下午
 */
@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Department createDepartment(@RequestBody Department department){
        return this.departmentService.createDepartment(department);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Department> listDepartments(){
        return this.departmentService.listDepartments();
    }
}
