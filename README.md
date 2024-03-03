# Employee-Management-API

Employee Management API is a RESTful web application built with Spring Boot that manages employees and departments.

## Features

- **Employee Management**: Allows users to perform CRUD operations on employees.
- **Department Management**: Allows users to perform CRUD operations on departments.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA

## Endpoints

| Endpoint                              | Description                                        |
|---------------------------------------|----------------------------------------------------|
| `GET /api/employees`                  | Get a list of all employees.                       |
| `GET /api/employees/{id}`             | Get details of a specific employee by ID.          |
| `GET /api/department/{id}/employees`  | Get a list of employees belonging to a department. |
| `GET /api/employees/pageable`         | Get a pageable list of employees.                  |
| `GET /api/employees/search`           | Search for employees by name.                      |
| `POST /api/employees`                 | Add a new employee.                                |
| `PUT /api/employees`                  | Update an existing employee.                       |
| `DELETE /api/employees/{id}`          | Delete an employee by ID.                          |


| Endpoint                                  | Description                                    |
|-------------------------------------------|------------------------------------------------|
| `GET /api/departments`                    | Get a list of all departments.                 |
| `GET /api/departments/{id}`               | Get details of a specific department by ID.    |
| `POST /api/departments`                   | Add a new department.                          |
| `DELETE /api/departments/{id}`            | Delete a department by ID.                     |


## Getting Started

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Mustafa-Moghazy/Employee-Management-API.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Employee-Management-API
   ```

3. Import the project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

4. Build and run the application from your IDE.

5. Update the application.properties file to connect to your local database:
 
    - Open the `src/main/resources/application.properties` file.
    - Modify the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties to point to your local database.

6. Access the API endpoints using any REST client or web browser.


# Happy coding! 🚀✨
