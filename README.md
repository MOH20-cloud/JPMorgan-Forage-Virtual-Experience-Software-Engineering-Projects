# JPMorgan Chase Software Engineering Virtual Experience

This repository contains my completed projects for the **JPMorgan Chase & Co. Software Engineering Virtual Experience** on [Forage](https://www.theforage.com/).  

The program simulates real-world tasks that JPMorgan engineers work on, covering API integration, Spring Boot development, and RESTful services.  

---

##  Tasks Overview

### **Task 1: Setup & Initial Configuration**
- Set up the development environment.  
- Configured the starter Spring Boot project.  
- Verified that the base application builds and runs successfully.  

---

### **Task 2: Core Development**
- Built initial endpoints in a Spring Boot project.  
- Worked with project dependencies and application properties.  
- Tested API calls locally to ensure correct setup.  

---

### **Task 3: Data Handling**
- Implemented simple **data persistence** logic.  
- Configured Spring Boot to manage objects and return data through REST endpoints.  
- Practiced basic CRUD operations with mock data.  

---

### **Task 4: REST API Integration**
- Integrated Spring Boot with an **external REST API**.  
- Used `RestTemplate` to fetch JSON data and mapped it to a **POJO (Post.java)**.  
- Exposed clean endpoints:
  - `/external` → fetch default post  
  - `/posts/{id}` → fetch any post by ID  
  - `/safe-posts/{id}` → with error handling  
- Added `application.properties` for base URL configuration and pretty-printed JSON.  

---

### **Task 5: REST API Controller**
- Designed and implemented a custom **REST API controller**.  
- Created a **User** model with fields: `id`, `name`, and `email`.  
- Implemented full **CRUD operations**:
  - `GET /users` → list all users  
  - `GET /users/{id}` → get user by ID  
  - `POST /users` → create a new user  
  - `PUT /users/{id}` → update user details  
  - `DELETE /users/{id}` → delete a user  
- Tested endpoints in browser and Postman.  

---

##  How to Run Any Task
1. Navigate into the task folder:
   ```bash
   cd Task-<number>
