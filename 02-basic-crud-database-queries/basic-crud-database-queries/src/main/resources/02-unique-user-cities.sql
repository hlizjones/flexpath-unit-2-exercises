-- Using the Users table, write a query to list all the unique cities where users are located, and sort
-- the list in alphabetical order.

SELECT DISTINCT City FROM users
ORDER BY City;