HR Management System
This is an HR Management System built with Spring Boot, Hibernate, and Mockito. It is designed to manage employee records with ease and efficiency. The system allows HR teams to perform CRUD operations (Create, Read, Update, Delete) on employee data and ensures accurate transaction handling.

Features
Employee Management: Manage employee records, including details like name, department, and position.
CRUD Operations: Create, update, view, and delete employee records.
Transaction Handling: Ensure accurate handling of employee data across concurrent users.
Testing: Comprehensive tests with JUnit and Mockito for reliable performance and accuracy.
Technologies Used
Backend: Spring Boot
Persistence: Hibernate, JPA
Testing: JUnit, Mockito
API Testing: Postman
Database: MySQL


Testing with Postman

You can test the API endpoints using Postman. The available endpoints include:

GET /employees - Retrieve all employee records

POST /employees - Add a new employee

PUT /employees/{id} - Update an existing employee's information

DELETE /employees/{id} - Delete an employee record
