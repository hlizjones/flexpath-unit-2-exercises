package org.example.Models;

/**
 * A to-do list.
 */
public class ToDoList {
    // TODO: Add fields for the to-do list for each column in the table.
    private Integer id;
    private String name;

    // TODO: Add getters and setters for the fields.
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // TODO: Add a constructor that initializes the fields/takes all of the fields as arguments and sets them.

    public ToDoList(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    // TODO: Add an empty constructor.

    public ToDoList() {}
}
