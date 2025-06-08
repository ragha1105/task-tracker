### Task Tracker Spring Boot Application
This is a simple Spring Boot application that helps you manage tasks.  
It uses an H2 in-memory database

### How to Run the Project

## Prerequisites:
- Java (JDK 17 or higher)
- Maven
- Git

## Steps:
1. Clone the repository
2. Run the project using Maven (or use IntelliJ’s green run button if you prefer)
3. Open your browser and go to H2 Database Console
4. To view your database in a web browser:
   - Open: `http://localhost:8080/h2-console`
   - Use the following settings:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User Name: `sa`
   - Password: *(leave it empty)*

### Features
- Add new tasks
- View all tasks
- Update or delete existing tasks
- Uses in-memory H2 database (easy to test and reset)

### Important Notes
- All data is stored in memory and **will reset** every time you restart the app.
- Keep your `application.properties` file secure (don’t push secrets to GitHub).
- This project is for learning/demo purposes.


### Author

Raghavi Epuri
GitHub: [ragha1105](https://github.com/ragha1105)

