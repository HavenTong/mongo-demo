package com.haven.mongodemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author HavenTong
 * @date 2019/11/12 4:52 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "dept")
public class Department {
    @Id
    String departmentId;

    @Indexed(name = "deptName")
    private String name;
    private String description;

    private List<Employee> employees;
}
