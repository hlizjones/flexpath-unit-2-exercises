-- Write a query that gets all orders from the User with the username 'jdoe'
-- Include the OrderID, and ShippingAddress
-- Use a subquery to get the UserID for the user with the username 'jdoe' from the Users table
-- Order the results by OrderID in descending order

SELECT OrderID, ShippingAddress FROM orders
WHERE UserID = (SELECT UserID from users WHERE UserName = 'johndoe')
ORDER BY OrderID DESC;