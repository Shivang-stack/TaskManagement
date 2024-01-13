# Task Management Web Application

This is a simple web application for managing tasks, built using Java and a RESTful API. The application supports basic CRUD operations (Create, Read, Update, Delete) for tasks. Below are the technical specifications and instructions on how to use the application.
## Demo

### Index Page
![image](https://github.com/Shivang-stack/TaskManagement/assets/56068903/27e55a3b-0fc5-4582-9ebd-32528e144070)

### Update Task Pop up
![image](https://github.com/Shivang-stack/TaskManagement/assets/56068903/429db199-db91-47ae-be39-d8ff15b740d8)

## Technical Specifications

1. **Backend:**
    - **Java:**
        - The primary programming language used for backend development.   

    - **Spring Boot:**
        - A Java-based framework used for building the RESTful API.
        - Simplifies the development of production-ready applications.

    - **Spring Data JPA:**
        - Part of the larger Spring Data project, simplifying data access using JPA.
        - Enables easy implementation of data access layers.

    - **Lombok:**
        - Library to reduce boilerplate code.
        - Annotations like `@Data`, `@AllArgsConstructor`, `@NoArgsConstructor` are used for concise code.

    - **MySQL Connector:**
        - Java-based driver for connecting to MySQL databases.
        - Used for establishing a connection between the Spring Boot application and the MySQL database.

2. **Frontend:**
   - **Thymeleaf:**
        - A modern server-side Java template engine.
        - Used for server-side rendering of HTML templates.

3. **Database:**
   - Uses MySQL as the relational database to store tasks.
   - Database Name: springbootdb
   - Database Connection: jdbc:mysql://localhost:3306/springbootdb
   - Username: root
   - Password: root1234

4. **API Documentation:**
   - Includes proper API documentation using Swagger.

5. **Unit Tests:**
   - Includes unit tests to ensure the functionality and reliability of the API.

## Code Structure

### Entity
```java
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TASK_TBL")
public class Task {
    // Fields: id, task_name, description, compeleted
}
```

### Service
```java
@Service
public class TaskService {
    // Methods: createTask, getTasks, getTaskById, deleteTask, updateTask
}
```

### Controller
```java
@RestController
public class TaskController {
    // Endpoints: addTask, findAllTasks, findTaskById, updateTask, deleteTask
}
```

### Index Controller
```java
@Controller
public class IndexController {
    // Endpoint: index
}
```

## How to Use

1. **Run the Application:**
   - Ensure you have Java installed.
   - Set up a MySQL database and update the application.properties file with the database configuration.
   - Run the application.

2. **Access the Webpage:**
   - Open a web browser and go to `http://localhost:8080/`.
   - The index page will be displayed.

3. **API Endpoints:**
   - **Add Task:** `POST /addtask` - Add a new task.
   - **Get All Tasks:** `GET /tasks` - Retrieve a list of all tasks.
   - **Get Task by ID:** `GET /task/{id}` - Retrieve a task by its ID.
   - **Update Task:** `PUT /update` - Update an existing task.
   - **Delete Task by ID:** `DELETE /delete/{id}` - Delete a task by its ID.

4. **API Documentation:**
   - Access Swagger UI at `http://localhost:8080/swagger-ui.html` for detailed API documentation.

     ![image](https://github.com/Shivang-stack/TaskManagement/assets/56068903/6918f71d-022b-43ec-8843-601d63ec4ea2)


5. **Unit Tests:**
   - Run the provided unit tests to ensure the functionality of the API.
   - Run class AssignmentApplicationTests

