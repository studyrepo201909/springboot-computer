# Getting Started

System Requirements
- JDK 1.8
- Gradle 5.6

Technique
- SpringBoot
- JPA
- Postgres
- Junit5
- Mockito
- Lombok

#### Database

Locally you will need a Postgres database running on port 5432.

To start a local database we provide a `docker-compose.yml` file that can start the appropriate containers, you only
need to run the following command:

```bash
docker-compose up -d
```

This will provision the docker containers and map the necessary ports to your local machine. In order to stop the containers
you must run this command in the same directory as the `docker-compose.yml` file:

```bash
docker-compose down
```

### How to start
To start the application in local, use the gradle command

`./gradlew bootRun`

when it startup, you can visit the application use `http://localhost:8080` via browsers or postman tools, then you can see `Hello World.`. 
