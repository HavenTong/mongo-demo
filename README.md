# mongo-demo
A demo using Spring Boot + MongoDB to do CRUD.

<div align="center"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Mongodb.png/1200px-Mongodb.png" width="50%"></img></div>

## 2 ways

- `MongoRepository`

```java
// DepartmentRepository.java
@Repository
public interface DepartmentRepository extends MongoRepository<Department, String>
```

- `MongoTemplate`

```java
// DeptTemplateRepository
@Repository
public class DeptTemplateRepository {
    @Autowired
    private MongoTemplate mongoTemplate;
```



## Domain

- Employee

```java
/**
 * @author HavenTong
 * @date 2019/11/12 16:49 
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
```

- Department

```java
/**
 * @author HavenTong
 * @date 2019/11/12 16:52 
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

```







