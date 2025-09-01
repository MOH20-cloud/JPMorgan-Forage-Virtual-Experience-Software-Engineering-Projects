package com.example.h2demo;

import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    public Note() {}

    public Note(String text) { this.text = text; }

    public Long getId() { return id; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}
