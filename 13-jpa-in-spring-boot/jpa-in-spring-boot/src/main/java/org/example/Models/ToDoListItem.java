package org.example.Models;

/**
 * A to-do list item.
 */
public class ToDoListItem {
    // TODO: Add fields for the to-do list.
    private Integer id;
    private String text;
    private Integer toDoListId;
    private Boolean completed;
    // TODO: Add getters and setters for the fields.

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setToDoListId(Integer toDoListId) {
        this.toDoListId = toDoListId;
    }

    public Integer getToDoListId() {
        return toDoListId;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Boolean getCompleted() {
        return completed;
    }

    // TODO: Add a constructor that initializes the fields.

    public ToDoListItem (Integer id, String text, Integer todoListId, Boolean completed) {
        this.id = id;
        this.text = text;
        this.toDoListId = todoListId;
        this.completed = completed;
    }
    // TODO: Add an empty constructor.

    public ToDoListItem() {}
}
