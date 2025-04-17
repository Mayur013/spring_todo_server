package com.todo.todo.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {

    @Id
    private String id;  // MongoDB uses String for the auto-generated ID (ObjectId)

    private String task;

    private boolean completed;

    // Getters
    public String getId() {
        return this.id;
    }

    public String getTask() {
        return this.task;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
