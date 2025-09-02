package com.example.task4;

// This class mirrors the JSON keys from the API.
// Jackson (included with Spring) will automatically map JSON -> this object.
public class Post {
    public int userId;
    public int id;
    public String title;
    public String body;
}
