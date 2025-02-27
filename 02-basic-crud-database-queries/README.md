DATABASEdataba# SELECT query exercises

The exercises in this project are designed to help you review your knowledge of SQL SELECT statements.

## Creating the database

To create the products database, open MySql Workbench and then create the database with the name "ecommerce." 

Once the database has been created, open a query window for the database and then open the table creation
script at `basic-crud-database-queries/src/main/resources/create-database.sql` in the editor and execute it.

After running the query, you can verify that the tables have been created by expanding the database in the
MySql workbench and then expanding the tables folder and confirming that the following tables are present:

- `Users`
- `Categories`
- `Products`
- `Orders`
- `OrderItems`
- `Payments`

You should also open each table and review the structure and data in the tables to understand the data and
relationships between the tables.

At any point, if you need to reset the test database, you can simply re-run this `create-database.sql` script.
It will drop the tables if they exist and then recreate them and repopulate them with the initial data.

If you already have this database created from another exercise, you should still run the script to ensure that
the tables are in the correct state for the exercises in this repository.

## Exercises

The exercises are located in the `basic-crud-database-queries/src/main/resources/` folder next to the
`create-database.sql` script. To complete each exercises, you will need to open the file in a query window
in MySql workbench and then write the query to solve the exercise.

Each exercise file currently contains a description of the single query you need to write to solve the
exercise. Write the query in the file and then execute it to see the results until you are satisfied that
the query is correct.

## Testing Your Work

You can test your work by opening IntelliJ and opening the project file at `basic-crud-database-queries/pom.xml`
and then running the tests in the `src/test/java` folder. The tests will run the queries in the exercise files
and compare the results to the expected results. If the results match, the test will pass. If they do not match,
the test will fail and you will need to modify your query to get it to pass.

> [!NOTE]
> These unit tests run a temporary embedded MySQL server and database copy.  They do not run against your local
> MySQL server or database.  This is to ensure that the tests are repeatable and do not depend on the state of
> your local database.

Error Code: 1140. In aggregated query without GROUP BY, expression #1 of SELECT list contains nonaggregated column 'ecommerce.orderitems.ProductID'; this is incompatible with sql_mode=only_full_group_by
