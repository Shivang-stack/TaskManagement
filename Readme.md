# Task Management Web Application

This is a simple web application for managing tasks, built using Java and a RESTful API. The application supports basic CRUD operations (Create, Read, Update, Delete) for tasks. Below are the technical specifications and instructions on how to use the application.
## Demo

### Index Page
![image](https://github.com/Shivang-stack/TaskManagement/assets/56068903/27e55a3b-0fc5-4582-9ebd-32528e144070)

### Update Task Pop up
![image](https://github.com/Shivang-stack/TaskManagement/assets/56068903/429db199-db91-47ae-be39-d8ff15b740d8)

## Technical Specifications

1. **Backend:**
   - Built with Java.
   - Uses Spring Boot, a Java framework for building RESTful APIs.
   - Utilizes a relational database (MySQL) to store tasks.
   - Implements CRUD operations using appropriate HTTP methods (POST, GET, PUT, DELETE).
   - Ensures proper error handling and validation for inputs.

2. **Frontend:**
   - Simple webpage using HTML/CSS.
   - Accesses the backend API to perform CRUD operations on tasks.

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

