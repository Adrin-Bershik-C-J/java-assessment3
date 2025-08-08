# Java Assessment 3 - Event Registration System

[GitHub Repository](https://github.com/Adrin-Bershik-C-J/java-assessment3)

## Overview

This is a Spring Boot REST API project implementing a simple Event Registration system.  
It allows users to create events, register users, and register those users for events.

The application uses:

- Spring Boot with Spring Data JPA for ORM  
- Hibernate for database interactions  
- MapStruct for DTO to Entity mapping  
- Jakarta Bean Validation for input validation  
- Global exception handling for validation and resource errors

---

## Features

- **User Management**: Create and manage users with basic validation.  
- **Event Management**: Create events with fields like title, description, date, and location.  
- **Registrations**: Register users to events with automatic registration date.  
- **Validation**: Input validation for all request DTOs to ensure data integrity.  
- **Exception Handling**: Custom global exception handling to return proper HTTP status and messages.  
- **DTO Mapping**: Uses MapStruct for clean conversion between Entities and DTOs.

---

## Technologies Used

- Java 21  
- Spring Boot 3.0+  
- Spring Data JPA  
- Hibernate  
- MapStruct  
- Jakarta Validation (JSR-380)  
- Lombok  
- H2 Database (or configure your own)  
- Maven

---

## Setup and Run

### Prerequisites

- JDK 21 or later  
- Maven 3.8+  
- (Optional) IDE like IntelliJ IDEA or Eclipse  

### Running the application

1. Clone the repo:

   ```bash
   git clone https://github.com/Adrin-Bershik-C-J/java-assessment3.git
   cd java-assessment3
## Project Structure
```
adrin-bershik-c-j-java-assessment3/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── request.http
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── assessment3/
│   │   │               ├── Assessment3Application.java
│   │   │               ├── controller/
│   │   │               │   ├── EventController.java
│   │   │               │   ├── RegisterController.java
│   │   │               │   └── UserController.java
│   │   │               ├── dto/
│   │   │               │   ├── EventRequestDTO.java
│   │   │               │   ├── EventResponseDTO.java
│   │   │               │   ├── RegistrationRequestDTO.java
│   │   │               │   ├── RegistrationResponseDTO.java
│   │   │               │   ├── UserRequestDTO.java
│   │   │               │   └── UserResponseDTO.java
│   │   │               ├── entity/
│   │   │               │   ├── Event.java
│   │   │               │   ├── Registration.java
│   │   │               │   └── User.java
│   │   │               ├── exception/
│   │   │               │   ├── GlobalExceptionHandler.java
│   │   │               │   └── ResourceNotFoundException.java
│   │   │               ├── mapper/
│   │   │               │   ├── EventMapper.java
│   │   │               │   ├── RegistrationMapper.java
│   │   │               │   └── UserMapper.java
│   │   │               ├── repository/
│   │   │               │   ├── EventRepository.java
│   │   │               │   ├── RegistrationRepository.java
│   │   │               │   └── UserRepository.java
│   │   │               └── service/
│   │   │                   ├── EventService.java
│   │   │                   ├── RegisterService.java
│   │   │                   └── UserService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── assessment3/
│                       └── Assessment3ApplicationTests.java
└── .mvn/
    └── wrapper/
        └── maven-wrapper.properties
```
