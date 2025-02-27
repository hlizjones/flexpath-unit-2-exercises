CREATE TABLE authors
(
author_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
birth_year INT NOT NULL,
country VARCHAR(255) NOT NULL,
PRIMARY KEY (author_id)
);

CREATE TABLE members
(
member_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
join_date DATE NOT NULL,
PRIMARY KEY(member_id)
);

CREATE TABLE genres
(
genre_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
PRIMARY KEY(genre_id)
);

CREATE TABLE books
(
book_id INT NOT NULL AUTO_INCREMENT,
title VARCHAR(255) NOT NULL,
author_id INT NOT NULL,
genre_id INT NOT NULL,
publication_year INT NOT NULL,
PRIMARY KEY (book_id),
FOREIGN KEY (author_id) REFERENCES authors(author_id),
FOREIGN KEY (genre_id) REFERENCES genres(genre_id)
);

CREATE TABLE loans
(
loan_id INT NOT NULL AUTO_INCREMENT,
book_id INT NOT NULL,
member_id INT NOT NULL,
loan_date DATE NOT NULL,
return_date DATE,
PRIMARY KEY (loan_id),
FOREIGN KEY (book_id) REFERENCES books(book_id),
FOREIGN KEY (member_id) REFERENCES members(member_id)
);

INSERT INTO authors
VALUES (1, 'F. Scott Fitzgerald', 1896, 'USA'),
(2, 'Harper Lee', 1926, 'USA'),
(3, 'George Orwell', 1903, 'UK'),
(4, 'Jane Austen', 1775, 'UK'),
(5, 'J.D. Salinger', 1919, 'USA');

INSERT INTO members
VALUES (1, 'Alice Smith', '2020-01-01'),
(2, 'Bob Johnson', '2020-01-15'),
(3, 'Charlie Brown', '2020-02-01');

INSERT INTO genres
VALUES (1, 'Fiction'),
(2, 'Mystery'),
(3, 'Dystopian'),
(4, 'Romance'),
(5, 'Coming of Age');

INSERT INTO books
VALUES (1, 'The Great Gatsby', 1, 1, 1925),
(2,'To Kill a Mockingbird', 2, 2, 1960),
(3, '1984', 3, 3, 1949),
(4, 'Pride and Prejudice', 4, 4, 1813),
(5, 'The Catcher in the Rye', 5, 5, 1951);

INSERT INTO loans
VALUES (1, 1, 1, '2020-01-01', '2020-01-15'),
(2, 2, 2, '2020-01-15', '2020-02-01'),
(3, 3, 3, '2020-02-01', NULL);