
# Spring Boot RESTful API - SOLID Principles Example

This is a simple Spring Boot application created to demonstrate and apply the **SOLID** principles in software development, following a **RESTful API** pattern. The goal is to provide a clean, maintainable, and scalable architecture while adhering to industry best practices.

## Features

- Implements the **SOLID** principles to ensure well-structured and modular code
- RESTful API design for easy integration with front-end applications or other services
- Swagger UI documentation for easy access to available API routes

## Prerequisites
- **Java 21+**
- **Maven 3.9+**
- **MongoDB** (for data storage)
- Basic knowledge of RESTful APIs and Spring Boot.

## Getting Started

### 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### 2. Build the Project

You can build the project using Maven:

```bash
mvn clean install
```

### 3. Run the Application

To run the application locally, use the following command:

```bash
mvn spring-boot:run
```

Your application should now be running at `http://localhost:8080`.

### 4. Access API Documentation

Once the application is running, you can view the Swagger UI to explore all available routes and their details:

- **Swagger UI URL:** [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

This will provide you with a detailed overview of the API endpoints, including the HTTP methods, request parameters, and response structure.

## Project Structure

This project follows the **SOLID** principles, with each principle represented in the code structure.

### S - Single Responsibility Principle (SRP)
Each class and module in the project has a single responsibility, focusing on a specific task.

### O - Open/Closed Principle (OCP)
The project is designed to be open for extension but closed for modification, allowing new features to be added with minimal changes to existing code.

### L - Liskov Substitution Principle (LSP)
Subtypes can be used interchangeably without affecting the correctness of the application.

### I - Interface Segregation Principle (ISP)
The interfaces are designed to be lean and specific, with each client depending only on the methods it needs.

### D - Dependency Inversion Principle (DIP)
High-level modules depend on abstractions, not on concrete implementations.

## Contact

If you have any questions or would like to get in touch, feel free to reach out:

- [LinkedIn: ulipese](https://linkedin.com/in/ulipese)
- [GitHub: ulipese](https://github.com/ulipese)

---

Happy coding! 🚀