package org.example.Controllers;

import org.example.Models.ToDoList;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


/**
 * The controller for to-do lists.
 */
@RestController
@RequestMapping("/todo-lists")
public class ToDoListController {
    /**
     * The JDBC template created at construction for querying the database.
     */
    private JdbcTemplate jdbcTemplate;

    /**
     * Creates a new to-do list controller.
     *
     * @param dataSource The data source for the controller.  (Provided by Spring with the
     *                   values from application.properties.)
     */
    public ToDoListController(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class ToDoListRowMapper implements RowMapper<ToDoList> {
        @Override
        public ToDoList mapRow(ResultSet rs, int rowNum) throws SQLException {

            ToDoList toDoList = new ToDoList();
            toDoList.setId(rs.getInt("id"));
            toDoList.setName(rs.getString("name"));

            return toDoList;
        }
    }

    /**
     * Gets all to-do lists.
     *
     * @return All to-do lists.
     */
    @GetMapping
    public List<ToDoList> getToDoLists() {
        // TODO: Use the JDBC template to get all to-do lists from the database and map them to ToDoList objects.

        String sql = "SELECT * FROM todo_lists";
        List<ToDoList> toDoLists = jdbcTemplate.query(sql, new ToDoListRowMapper());
        return toDoLists;
    }

    /**
     * Gets a to-do list by ID.
     *
     * @param id The ID of the to-do list.
     * @return The to-do list with the given ID.
     */
    @GetMapping("/{id}")
    public ToDoList getToDoList(@PathVariable int id) {
        // TODO: Use the JDBC template to get the to-do list with the given ID from the database and map it to a ToDoList object.
        String sql = "SELECT id, name FROM todo_lists WHERE id = ?";

        ToDoList toDoList = new ToDoList();
        toDoList = jdbcTemplate.queryForObject(sql, new ToDoListRowMapper(), id);

        return toDoList;
    }

    /**
     * Creates a new to-do list.
     *
     * @param toDoList The to-do list to create.
     */
    @PostMapping
    public void createToDoList(@RequestBody ToDoList toDoList) {
        // TODO: Use the JDBC template to insert a new to-do list with the given title into the database.

        String sql = "INSERT INTO todo_lists (name) VALUES (?)";
        jdbcTemplate.update(sql, toDoList.getName());
    }

    /**
     * Updates a to-do list.
     *
     * @param id The ID of the to-do list.
     * @param toDoList The updated to-do list.
     */
    @PostMapping("/{id}")
    public void updateToDoList(@PathVariable int id, @RequestBody ToDoList toDoList) {
        // TODO: Use the JDBC template to update the to-do list with the given ID in the database with the given title.

        String sql = "UPDATE todo_lists SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, toDoList.getName(), id);
    }

    /**
     * Deletes a to-do list.
     *
     * @param id The ID of the to-do list.
     */
    @PostMapping("/{id}/delete")
    public void deleteToDoList(@PathVariable int id) {
        // TODO: Use the JDBC template to delete the to-do list with the given ID from the database.

        String sql = "DELETE FROM todo_lists WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
