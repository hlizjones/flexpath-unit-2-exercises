package org.example.Controllers;
import org.example.Models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {
    public List<Book> books = new ArrayList<>(List.of(
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925),
            new Book(2, "To Kill a Mockingbird", "Harper Lee", 1960),
            new Book(3, "The Catcher in the Rye", "J.D. Salinger", 1951),
            new Book(4, "Beloved", "Toni Morrison", 1987),
            new Book(5, "The Color Purple", "Alice Walker", 1982)
    ));

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    @GetMapping(path = "/{id}")
    public Book getBookById(@PathVariable ("id") int id) {
        return books.get(id-1);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        books.add(book);
    }

    @PutMapping(path = "/{id}")
    public void updateBook(@PathVariable ("id") int id, @RequestBody Book book) {
        books.set(id-1, book);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteBook(@PathVariable("id") int id) {
        books.remove(id-1);
    }
}
