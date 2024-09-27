package com.example.todolist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoListTest {

    @Test
    public void testAddItem() {
        ToDoList toDoList = new ToDoList();
        ToDoItem item = new ToDoItem("Test task");
        toDoList.addItem(item);

        assertEquals(1, toDoList.getItems().size());
        assertEquals("Test task", toDoList.getItems().get(0).getDescription());
    }

    @Test
    public void testMarkItemComplete() {
        ToDoList toDoList = new ToDoList();
        ToDoItem item = new ToDoItem("Test task");
        toDoList.addItem(item);

        toDoList.markItemComplete(0);
        assertTrue(toDoList.getItems().get(0).isComplete());
    }

    @Test
    public void testRemoveItem() {
        ToDoList toDoList = new ToDoList();
        ToDoItem item = new ToDoItem("Test task");
        toDoList.addItem(item);

        toDoList.removeItem(item);
        assertEquals(0, toDoList.getItems().size());
    }
}
