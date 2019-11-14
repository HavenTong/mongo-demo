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









