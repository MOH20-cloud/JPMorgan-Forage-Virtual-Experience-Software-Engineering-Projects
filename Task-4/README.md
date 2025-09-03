#  Task 4 README  

```markdown
# Task 4 - REST API Integration

##  Overview
In this task, I integrated my Spring Boot application with an **external REST API**.  
The goal was to fetch JSON data, map it to a Java object (POJO), and expose it through REST endpoints.  

---

##  Steps Implemented
1. Added dependencies in `pom.xml`:
   - `spring-boot-starter-web`
   - `jackson-databind`
2. Configured `application.properties` with:
   ```properties
   external.api.base=https://jsonplaceholder.typicode.com
   spring.jackson.serialization.indent_output=true
