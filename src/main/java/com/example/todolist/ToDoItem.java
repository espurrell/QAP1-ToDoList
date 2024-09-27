package com.example.todolist;

public class ToDoItem {
    private String description;
    private boolean isComplete;

    public ToDoItem(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        this.isComplete = true;
    }

    @Override
    public String toString() {
        return description + " [Completed: " + isComplete + "]";
    }
}