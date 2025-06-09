### Task Tracker Spring Boot Application
This is a simple Spring Boot application that helps you manage tasks and know the status of them.
It supports both **H2 (in-memory)** and **MySQL (persistent)** databases.

### Technologies used:
- Java (JDK 17+)
- Spring Boot
- Spring Data JPA
- Maven
- MySQL (or H2)
- REST API (tested using Postman)

### How to Run the Project

#### Prerequisites:
- Java 17+
- Maven
- MySQL (for persistent setup)
- Git

## Steps 
1. Clone the repository
2. Copy the config template and add your credentials
3. Run the project using Maven (or use IntelliJ’s green run button if you prefer)

## Database Options
1. Default: MySQL
    - JDBC URL: jdbc:mysql://localhost:3306/taskdb
    - Username & Password: Set in application.properties

2. For Testing: H2 (in-memory)
    - Uncomment H2 section in application.properties
    - Open browser at: http://localhost:8080/h2-console
    - JDBC URL: jdbc:h2:mem:taskdb
    - User: sa, Password: (leave empty)

### Features
- Add new tasks
- View all tasks
- Update or delete existing tasks
- Flexible database configuration
- Beginner-friendly structure

### Important Notes
- H2 database resets on every restart
- MySQL provides persistent storage
- Credentials are not committed — only application-example.properties is tracked

### Author

Raghavi Epuri
GitHub: [ragha1105](https://github.com/ragha1105)

