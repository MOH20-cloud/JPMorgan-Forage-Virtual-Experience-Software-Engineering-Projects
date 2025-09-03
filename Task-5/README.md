#  Task 5 README  

```markdown
# Task 5 - REST API Controller

##  Overview
In this task, I designed and implemented my own REST API in Spring Boot.  
The project focused on exposing full CRUD operations with a simple **User** model.  

---

## Steps Implemented
1. Created a `User` model with fields: `id`, `name`, and `email`.  
2. Added a **default constructor** and **getters/setters** for JSON serialization.  
3. Built `UserController` with endpoints:
   - `GET /users` → list all users  
   - `GET /users/{id}` → get user by ID  
   - `POST /users` → create a new user  
   - `PUT /users/{id}` → update an existing user  
   - `DELETE /users/{id}` → remove a user  
4. Used an in-memory `List<User>` for storage and tested with sample data.  

---

##  How to Run
1. Navigate into the Task-5 folder:
   ```bash
   cd Task-5
