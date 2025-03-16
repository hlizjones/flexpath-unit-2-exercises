# Spring Boot MVC

The exercises in this project are designed to help you understand Spring Boot
MVC.

## Getting Started

To get started, open the project file located in `spring-boot-and-mvc/pom.xml`
in IntelliJ.

## Project Overview 

This project contains a simple Spring Boot application with a controller class
and a model class for managing a list of books.  The list is defined in the
`BookController` class as a simple in-memory list that is initialized with a few
books when the application starts.

The `Book` model class contains a simple class with fields for the id, title,
author, and year of publication. You will not need to modify this class.

The `BookController` class contains an `ArrayList` of
books and you will need to implement the following REST endpoints by filling
in the appropriate methods in the controller class and applying the appropriate
Spring annotations

## Exercise

To complete this exercise, you will need to implement the following REST
endpoints in the `BookController` class:

- `GET /books` - Returns a list of all books in the list.
- `GET /books/{id}` - Returns a single book with the given id.
- `POST /books` - Adds a new book to the list.
- `PUT /books/{id}` - Updates an existing book with the given id.
- `DELETE /books/{id}` - Deletes a book with the given id.

To implement these endpoints, you will need to use the appropriate Spring
annotations to map the endpoints to the methods in the controller class. You
will also need to use the correct annotations for any method parameters to
map request parameters or request bodies to method arguments.

## Testing the Application using Postman (Optional)

To test the application, you can use Postman to send requests to the REST
endpoints. If you are unfamiliar with Postman, you can complete the lesson
on Postman from later in this course, and then return to this exercise. 

First, launch the application by right-clicking on the `SpringBootMvcApplication`
class and selecting "Run 'SpringBootMvcApplication'".

Next, open Postman and create a new request by clicking on the "New" button in

To test the `GET /books` endpoint, send a GET request to
`http://localhost:8080/books`. You should receive a response with a list of
books.

To test the `GET /books/{id}` endpoint, send a GET request to
`http://localhost:8080/books/{id}` where `{id}` is the id of the book you want
to retrieve. You should receive a response with the book with the given id.

To test the `POST /books` endpoint, send a POST request to 
`http://localhost:8080/books` with a JSON body containing the book you want to
add. You should receive a response with the book that was added. You can call
the `GET /books` endpoint to verify that the book was added.

To test the `PUT /books/{id}` endpoint, send a PUT request to 
`http://localhost:8080/books/{id}` with a JSON body containing the book you want
to update, and replacing `{id}` with the id of the book you want to update. You
should receive a response with the updated book. You can call the `GET /books`
endpoint to verify that the book was updated.

To test the `DELETE /books/{id}` endpoint, send a DELETE request to
`http://localhost:8080/books/{id}` where `{id}` is the id of the book you want
to delete. You should receive a response with the book that was deleted.  You
can call the `GET /books` endpoint to verify that the book was deleted.

## Running the Unit Tests

As always, final verification of your code should be done by running the unit
tests.

To run the tests, right-click on the `test/java/org.example/src/ExerciseTests`
class and select "Run 'ExercisesTests'". This will run all of the tests for
the exercises. When a test succeeds, you will see a green checkmark next to
the test. When a test fails, you will see a red X next to the test.  Once all
of the tests pass, you have completed the exercises.
