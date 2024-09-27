package com.example.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDoItem> items;

    public ToDoList() {
        this.items = new ArrayList<>();
    }

    public void addItem(ToDoItem item) {
        items.add(item);
    }

    public List<ToDoItem> getItems() {
        return items;
    }

    public void removeItem(ToDoItem item) {
        items.remove(item);
    }

    public void markItemComplete(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).markComplete();
        }
    }
}