# java-simple-restapi
This Rest Api was created to studing.
```
In this application was used:
- Spring Boot
- JPA/Hibernate
- H2 Database
- Swagger
- Spring Validation
```
  ## You can:

  - Clone this repo:
  ```
  git clone git@github.com:rafaelcitario/java-simple-restapi
  ```

  - Run this application

  - Acess the endpoints:
  Docs
  ```
  http://localhost:8080/v3/api-docs
  ```
  Swagger ui
  ```
  http://localhost:8080/swagger-ui/index.html
  ```

## HTTP Methods:
- ### Get one item, put and delete methods:
```

/api/livros/{id}
```
- ### Get all items and Post method:
```
/api/livros/
```

## Database Acess:
```
DATABASE: H2 EMBEDED
URL: jdbc:h2:mem:simple-restapi
USERNAME: restapi
PASSWORD:
```
To Access DataBase:
```
http://localhost:8080/h2-console
```












  
