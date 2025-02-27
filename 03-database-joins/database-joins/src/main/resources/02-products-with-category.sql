-- Write a query to list all products, including their ProductID, ProductName, and CategoryName (from the Category
-- table.) Use a LEFT JOIN to ensure that products are displayed even if they do not have a category assigned.
-- Order the results by ProductID in ascending order.

SELECT ProductID, ProductName, CategoryName
FROM products LEFT JOIN categories
ON products.CategoryID = categories.CategoryID
ORDER BY ProductID;