# Game CRUD Backend

This is a Spring Boot-based backend application for managing games, integrated with a React frontend, providing CRUD (Create, Read, Update, Delete) operations for game entities. The application includes REST APIs for game management and Swagger for API documentation.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Building the Project](#building-the-project)
- [Running Locally](#running-locally)
- [API Endpoints](#api-endpoints)
- [Swagger Documentation](#swagger-documentation)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Overview
The `game-crud-backend` project is a full-stack application where the backend is built with Spring Boot, using Java, and the frontend (React) is integrated and served as static resources. It uses a SQL database (e.g., MySQL or PostgreSQL) for persistence and follows RESTful API best practices.

## Features
- CRUD operations for games (Create, Read, Update, Delete).
- RESTful APIs with Spring Boot.
- Integrated React frontend for user interaction.
- Swagger (OpenAPI) for API documentation.
- Docker support for containerized deployment.

## Prerequisites
- **Java 17**: Required for building and running the Spring Boot application.
- **Maven 3.8+**: For dependency management and building the project.
- **Node.js and npm**: Required for building the React frontend (if modifications are needed).
- **Docker**: Optional, for containerized deployment.
- **Git**: For version control.
- **Render Account**: For deploying the application (or another hosting provider).

## Installation

### Clone the Repository
```bash
git clone https://github.com/your-username/game-crud-backend.git
cd game-crud-backend
```

## Building the Project
Before running or deploying the application, you need to build the project to generate the necessary artifacts (e.g., JAR file for Spring Boot and static files for React). Follow these steps:

### Build the Spring Boot Backend:
1. Ensure you have Maven installed and configured.
2. Run the following command in the root directory of the project to compile, test, and package the application:

```bash
mvn clean package
```

This command will:
- Clean the `target` directory.
- Compile the Java code.
- Run any tests.
- Package the application into a JAR file named `game-crud-backend-0.0.1-SNAPSHOT.jar`, located in the `target` directory.

### Build the React Frontend (if modifications are needed):
1. Navigate to the `src/main/resources/static` directory where the React frontend is integrated:

```bash
cd src/main/resources/static
```

2. Install dependencies if not already present:

```bash
npm install
```

3. Build the React application:

```bash
npm run build
```

The build output will be placed in `src/main/resources/static/build`, which Spring Boot will serve as static content.

### Verify Build Output:
- Check the `target` directory to ensure `game-crud-backend-0.0.1-SNAPSHOT.jar` exists.
- Verify that the `src/main/resources/static` directory contains the React build files (HTML, JS, CSS, etc.).

## Running Locally
1. Ensure you have a database configured (e.g., MySQL or PostgreSQL). Update `src/main/resources/application.properties` or `application.yml` with your database URL, username, and password:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/game_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

2. Run the application using the JAR file:

```bash
java -jar target/game-crud-backend-0.0.1-SNAPSHOT.jar
```

Or, using Maven:

```bash
mvn spring-boot:run
```

3. Access the application at `http://localhost:8080`. The React frontend will be served, and APIs can be accessed via `/api/games`.

## API Endpoints
The following REST endpoints are available:

- `POST /api/games` - Create a new game
- `GET /api/games` - Get all games
- `GET /api/games/{id}` - Get a specific game by ID
- `PUT /api/games/{id}` - Update a game
- `DELETE /api/games/{id}` - Delete a game

## Swagger Documentation
- Access Swagger UI at `http://localhost:8080/swagger-ui/index.html` when running locally.
- On deployment, replace `localhost:8080` with your deployed URL (e.g., `https://game-crud-backend.onrender.com/swagger-ui/index.html`).

## Deployment
To deploy the application, follow these steps:
1. Choose a hosting provider (e.g., **Render**, **Heroku**, **AWS**, **GCP**).
2. Ensure your database is hosted and accessible.
3. Deploy the backend JAR file or Docker container.
4. Deploy the React frontend if it's hosted separately.
5. Update the environment variables and configurations as needed.

## Contributing
Contributions are welcome! Please submit a pull request with detailed changes and follow best coding practices.

## License
This project is open-source and available under the MIT License.

