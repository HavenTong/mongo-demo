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

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Department updateDepartment(@RequestBody Department department,
                                       @PathVariable("id") String id){
        return this.departmentService.updateDepartment(department, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteDepartment(@PathVariable("id") String id){
        return this.departmentService.deleteDepartment(id);
    }

    @RequestMapping(value = "/many", method = RequestMethod.POST)
    public List<Department> createMultiDepartments(@RequestBody List<Department> departments){
        return this.departmentService.createMultiDepartments(departments);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<Department> getDepartmentByName(@PathVariable("name") String name){
        return this.departmentService.getDepartmentByName(name);
    }

    @RequestMapping(value = "/emp/{employee_name}", method = RequestMethod.GET)
    public Department getDepartmentByEmployeeName(@PathVariable("employee_name") String employeeName){
        return this.departmentService.getDepartmentByEmployeeName(employeeName);
    }
}
