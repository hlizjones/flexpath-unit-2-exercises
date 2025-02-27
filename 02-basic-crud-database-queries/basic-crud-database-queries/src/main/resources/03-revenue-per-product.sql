-- Using the Products and OrderItems tables, write a query to find the total revenue generated for
-- each product. The result should display the ProductID, ProductName, and the TotalRevenue
-- (calculated as the sum of Price * Quantity for each OrderItem entry for the product).
-- Order the results by ProductID in ascending order.

SELECT orderitems.ProductID, products.ProductName, SUM(orderitems.price * orderitems.quantity) AS TotalRevenue FROM orderitems
INNER JOIN products ON orderitems.ProductID=products.ProductID
GROUP BY orderitems.ProductID
ORDER BY orderitems.ProductID;