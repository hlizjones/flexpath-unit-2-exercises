-- Write a query to get all products including the ProductID, and the ProductName that are not in the OrderItems table
-- Use a subquery to get the ProductID values from the OrderItems table.
-- Order the results by ProductID in ascending order.

SELECT ProductID, ProductName from products
WHERE ProductID NOT IN (SELECT ProductID from orderitems)
ORDER BY ProductID;