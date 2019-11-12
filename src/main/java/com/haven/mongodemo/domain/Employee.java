package com.haven.mongodemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author HavenTong
 * @date 2019/11/12 4:49 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {

    @Id
    private String employeeId;
    private String name;
    private Integer age;
    private Double salary;
}
