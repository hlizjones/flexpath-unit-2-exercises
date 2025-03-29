package org.example.Controllers;
import org.example.Models.ToDoListItem;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 * The controller for to-do list items.
 */
@RestController
@RequestMapping("/todo-list-items")
public class ToDoListItemController {
    private JdbcTemplate jdbcTemplate;

    /**
     * Creates a new to-do list item controller.
     *
     * @param dataSource The data source for the controller.  (Provided by Spring with the
     *                   values from application.properties.)
     */
    public ToDoListItemController(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class ToDoListItemRowMapper implements RowMapper<ToDoListItem> {
        @Override
        public ToDoListItem mapRow(ResultSet rs, int rowNum) throws SQLException {
            ToDoListItem toDoListItem = new ToDoListItem();
            toDoListItem.setId(rs.getInt("id"));
            toDoListItem.setText(rs.getString("text"));
            toDoListItem.setToDoListId(rs.getInt("todo_list_id"));
            toDoListItem.setCompleted(rs.getBoolean("completed"));

            return toDoListItem;
        }
    }
    /**
     * Gets all to-do list items.
     *
     * @return All to-do list items.
     */
    @GetMapping
    public List<ToDoListItem> getToDoListItems() {
        // TODO: Use the JDBC template to get all to-do list items from the database and map them to ToDoListItem objects.
        String sql = "SELECT * FROM todo_list_items";
        List<ToDoListItem> toDoListItems = jdbcTemplate.query(sql, new ToDoListItemRowMapper());

        return toDoListItems;
    }

    /**
     * Gets a to-do list item by ID.
     *
     * @param id The ID of the to-do list item.
     * @return The to-do list item with the given ID.
     */
    @GetMapping("/{id}")
    public ToDoListItem getToDoListItem(@PathVariable int id) {
        // TODO: Use the JDBC template to get the to-do list item with the given ID from the database and map it to a ToDoListItem object.
        String sql = "SELECT id, text, todo_list_id, completed FROM todo_list_items WHERE id = ?";
        ToDoListItem toDoListItem = new ToDoListItem();
        toDoListItem = jdbcTemplate.queryForObject(sql, new ToDoListItemRowMapper(), id);

        return toDoListItem;
    }

    /**
     * Creates a new to-do list item.
     *
     * @param toDoListItem The to-do list item to create.
     */
    @PostMapping
    public void createToDoListItem(@RequestBody ToDoListItem toDoListItem) {
        // TODO: Use the JDBC template to insert the to-do list item into the database.

        String sql = "INSERT INTO todo_list_items (text, todo_list_id, completed) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, toDoListItem.getText(), toDoListItem.getToDoListId(), toDoListItem.getCompleted());
    }

    /**
     * Updates a to-do list item.
     *
     * @param id The ID of the to-do list item.
     * @param toDoListItem The updated to-do list item.
     */
    @PostMapping("/{id}")
    public void updateToDoListItem(@PathVariable int id, @RequestBody ToDoListItem toDoListItem) {
        // TODO: Use the JDBC template to update the to-do list item in the database.

        String sql = "UPDATE todo_list_items SET text = ?, todo_list_id = ?, completed = ? WHERE id = ?";
        jdbcTemplate.update(sql, toDoListItem.getText(), toDoListItem.getToDoListId(), toDoListItem.getCompleted(), id);
    }

    /**
     * Deletes a to-do list item.
     *
     * @param id The ID of the to-do list item.
     */
    @PostMapping("/{id}/delete")
    public void deleteToDoListItem(@PathVariable int id) {
        // TODO: Use the JDBC template to delete the to-do list item from the database.

        String sql = "DELETE FROM todo_list_items WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
