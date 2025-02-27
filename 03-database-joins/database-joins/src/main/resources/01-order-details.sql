-- Write a query to retrieve the details of all orders, including the OrderID, and FirstName and LastName of the user
-- placing the order..
-- Use an INNER JOIN to combine data from the Orders and Users tables, so you can include the user's name with each order.
-- Order the results by OrderID in ascending order.

SELECT * 
FROM orders INNER JOIN users
ON orders.UserID = users.UserID
ORDER BY OrderID;