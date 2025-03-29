package org.example.Controllers;


import org.example.Models.ShoppingListItem;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a controller for the shopping list.
 */
@RestController
@RequestMapping("/shopping")
public class ShoppingListController {
    /**
     * The shopping list.
     */
    private List<ShoppingListItem> shoppingList = new ArrayList<>(List.of(
        new ShoppingListItem(1, "Milk", 2.99, 1),
        new ShoppingListItem(2, "Bread", 1.99, 2),
        new ShoppingListItem(3, "Eggs", 3.99, 1),
        new ShoppingListItem(4, "Butter", 2.49, 1),
        new ShoppingListItem(5, "Cheese", 4.99, 1)
    ));

    /**
     * Gets all the items in the shopping list.
     *
     * @return All the items in the shopping list.
     */
    @GetMapping
    public List<ShoppingListItem> getShoppingList() {
        return shoppingList;
    }

    /**
     * Gets a shopping list item by its id.
     *
     * @param id The id of the item.
     * @return The item with the specified id, or null if no item was found.
     */
    @GetMapping("/{id}")
    public ShoppingListItem getShoppingListItemById(@PathVariable int id) {
        return shoppingList.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Adds a shopping list item to the shopping list.
     *
     * @param item The item to add.
     */
    @PostMapping
    public void addShoppingListItem(@RequestBody ShoppingListItem item) {
        shoppingList.add(item);
    }

    /**
     * Updates a shopping list item in the shopping list.
     *
     * @param id The id of the item.
     * @param item The item to update.
     */
    @PutMapping("/{id}")
    public void updateShoppingListItem(@PathVariable int id, @RequestBody ShoppingListItem item) {
        ShoppingListItem existingItem = getShoppingListItemById(id);
        if (existingItem != null) {
            existingItem.setTitle(item.getTitle());
            existingItem.setPrice(item.getPrice());
            existingItem.setQuantity(item.getQuantity());
        }
    }

    /**
     * Deletes a shopping list item from the shopping list.
     *
     * @param id The id of the item.
     */
    @DeleteMapping("/{id}")
    public void deleteShoppingListItem(@PathVariable int id) {
        shoppingList.removeIf(item -> item.getId() == id);
    }
}
