package com.example.task5;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>(
            Arrays.asList(
                new User(1, "Alice", "alice@example.com"),
                new User(2, "Bob", "bob@example.com")
            )
    );

    // GET all users
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    // GET user by ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return users.stream()
                    .filter(u -> u.getId() == id)
                    .findFirst()
                    .orElse(null);
    }

    // POST create new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    // PUT update user
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return user;
            }
        }
        return null;
    }

    // DELETE user
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        users.removeIf(u -> u.getId() == id);
        return "User with id " + id + " deleted.";
    }
}
