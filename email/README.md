# Email Client project

## Project needs

- Java Spring boot
- Mail API
- Database
- Thymeleaf template engine
- Spring Security

## Setup

- Spring boot
  - Use Spring boot initializr to create a new project with the following dependencies:
    - Language: Java
    - project: Gradle - Groovy
    - Spring Boot version: 4.1.1
    - Project group: com.lukas
    - Project artifact: email
    - Package name: com.lukas.email
    - Dependencies: - Spring Security - Thymeleaf - Java Mail Sender - PostgreSQL Driver
      Then run:

  ```bash
  gradle build
  ```

  it will setup the project and download all dependencies.

### Database setup

we need an database system i chose postgresql.
made an docker compose file so you need to install docker compose before use.

I chose adminer as admin panel because i use that in our course on this semester: Database and Software Architecture (DSA)

To to turn on the database run:

```bash
docker-compose up -d
```

#### Future improvements

In the future I will convert it to SQLite, but in the starting fase its easiere to work with something known.

## Project Overview

Create a secure email system for sending and receiving emails. Learn email protocols and secure web development.

### Key Features

- User authentication and email composition.
- Send and receive emails using SMTP/POP3.
- Store email history securely.
- Admin module to manage accounts.

### Learning Outcomes

- Integrate JavaMail API for email functionality.
- Build secure web applications with Spring Boot.
- Manage data with Hibernate.

## Sources

[Where i get the idea](https://www.geeksforgeeks.org/blogs/java-projects/)
[How to setup gradle](https://docs.gradle.org/current/userguide/part1_gradle_init.html)
[Setup Project](https://start.spring.io/)
