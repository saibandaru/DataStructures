package com.sai.datastructures.sql;

public class SQLStatements {
    /*
     * Language used to interact with Databases, non-case sensitive
     *
     * SELECT : extracts data from database
     * UPDATE : modifies data in database
     * DELETE : deletes data from database
     * INSERT INTO : adds new records to database
     * CREATE DATABASE : creates new database
     * ALTER DATABASE : modifies database
     * CREATE TABLE : creates new table
     * ALTER TABLE : modifies existing table structure
     * DROP TABLE : deletes a table from database
     * CREATE INDEX : creates index(search key) in a table
     * DROP INDEX : deletes index from a table
     */

    //region SELECT Statement
    /*
     * SELECT statement
     * Used to extract data from data base
     *
     * Syntax:
     * >>SELECT column1, column2
     * >>FROM table1;
     *
     * Fetches column1 and column2 entries from database and creates a temporary table called result set
     *
     * To fetch all rows from database:
     *
     * >> SELECT *
     * >> FROM table1;
     */
    //endregion

    //region SELECT Distinct

    /*
     * To get the distinct values from database, mosttime when we insert data we have same data in some columns, suchas
     * address or age. Which can be same so if we want to fetch distinct vales of a column then use DISTINCT
     *
     * syntax:
     * SELECT DISTINCT Address, Age
     * FROM Customers;
     *
     * In the above query we can have same address but not the combination of address and age
     */

    //endregion

    //region COUNT

    /*
     * If one wants to count the number of rows in a table then we go for COUNT keyword, which can be used as following:
     *
     * syntax:
     * >>SELECT COUNT(*)
     * >>FROM TableName;
     *
     * if we want to count the number of countries in the customers table then:
     * >>SELECT COUNT(DISTINCT Country)
     * >>FROM Customers
     */

    //endregion

    //region WHERE Clause

    /*
     * This is used to filter to desired records from a table by defining a condition, like:
     *
     * syntax:
     * >> SELECT coloumn1
     * >> FROM table1
     * >> WHERE condition1;
     *
     * there we get all the records with coloumn1 from table table1 which satisfy the condition condition1
     *
     * example:
     * >>SELECT CustomerName
     * >>FROM Customers
     * >>WHERE country = "India";
     *
     * WHERE clause condition supported:
     * (=, <>, <, >, <=, >=, BETWEEN, LIKE, IN)
     * To build compound condition one can also use AND, OR and NOT operations in the WHERE clause, like:
     *
     * >>SELECT CustomerName
     * >>FROM Customers
     * >>WHERE country = "India" AND City = "Delhi";
     *
     * How to use BETWEEN keyword in WHERE clause:
     * WHERE AGE BETWEEN 10 AND 30;
     *
     * LIKE keyword, to search name that is starting with S:
     * WHERE CustomerName LIKE 'S%';
     *
     * IN keyword, to search a subset of cities:
     * >>SELECT *
     * >>FROM Customers
     * >>WHERE City = 'Delhi' OR City = 'Mumbai';
     *
     * this can also be written using IN:
     * >>SELECT *
     * >>FROM Customers
     * >>WHERE City IN ('Delhi', 'Mumbai');
     */


    //endregion

    //region AND, OR and NOT

    /*
     * These are used to form a complex condition which has more that one condition item
     * AND: all the sub-conditions need to satisfy for the row to get passed/added
     * OR: any one sub-condition need to satisfy for the row to get passed/added
     * NOT: the condition has to fail inorder the NOT operator to pass
     */

    //endregion

    //region ORDER BY

    /*
     * THis is the keyword used to sort the result-set in ascending or descending order
     * By default ths order-by keyword sorts in Ascending order(ASC) use DESC to override it to descending order
     *
     * syntax:
     * >>SELECT col1, col2, col3
     * >>FROM Table1
     * >>ORDER BY col1, col2 ASC|DESC
     *
     * example:
     * >>SELECT *
     * >>FROM Customers
     * >>ORDER BY Country DESC;
     *
     * When there are two rows in ORDER BY Clause then one has to specify the order by for both else, the one that
     * doesn't have it specified is sorted in ascending order
     *
     * >>SELECT *
     * >>FROM Customers
     * >>ORDER BY Country DESC, City DESC;
     *
     */

    //endregion

    //region INSERT INTO

    /*
     * This statement is used to insert new data into table
     *
     * there are two syntactical ways to insert data into database:
     *
     * syntax 1:
     * >>INSERT INTO Table1 (col1, col2, col3, ..)
     * >>VALUES (row1Col1, row1Col2, row1Col3, ..);
     *
     * Here you define all the columns that you are specifying in the values tag,
     *
     * syntax 2:
     * >>INSERT INTO Table1
     * >>VALUES (row1Col1, row1Col2, row1Col3, ..);
     *
     * You can follow the second syntax, if you ate entering all the columns and in the same order the table is defined.
     *
     */

    //endregion

    //region NULL value in SQL (IS NULL and IS NOT NULL)

    /*
     * A NULL value is a record entry saved against column when the values is not specified during the record(row)
     * creation, this is not zero value but just black space.
     *
     * Usage of NULL in SQL
     *
     * >>SELECT *
     * >>FROM Customers
     * >>WHERE Address IS NULL
     */

    //endregion

    //region UPDATE (UPDATE ..SET)

    /*
     * THis is the statement used to modify the existing record in the table
     *
     * syntax:
     * >>UPDATE TableName
     * >>SET col1 = value1, col2 = values2
     * >>WHERE condition;
     *
     * example:
     * >>UPDATE Customers
     * >>SET CustomerName = 'Mike'
     * >>WHERE CustomerId = 10;
     *
     * Warning: WHERE clause for update statements is VERY important as it updates all whole column data if you miss it
     *
     */

    //endregion

    //region DELETE

    /*
     * This statement is used to delete records from table
     *
     * syntax:
     * >>DELETE
     * >>FROM Table
     * >>WHERE condition;
     */
    //endregion

    //region SELECT TOP Clause (MySQL LIMIT)

    /*
     * This is used to limit the number of records that are retrieved from a SELECT query, very useful while working on
     * large database/table.
     *
     * syntax:
     * >>SELECT TOP Number *
     * >>From Table
     * >>WHERE condition;
     *
     * Not all databases support TOP so in MySQL we use LIMIT Keyword, like:
     * >>LIMIT number;
     *
     * If you want to get TOP X percentage then we use:
     * >>SELECT TOP Number PERCENT *
     * >>From Table
     * >>WHERE condition;
     */

    //endregion

    //region MIN and MAX

    /*
     * MIN: returns the smallest value from the result-set column
     * MAX: returns the biggest value from the result-set column
     *
     * Min syntax:
     * >>SELECT MIN(Age)
     * >>FROM Customers
     * >>WHERE Country = 'India';
     *
     * Max syntax:
     * >>SELECT MIN(Price) AS LargestItemInKitchenSection
     * >>FROM Products
     * >>WHERE Category = 'Kitchen';
     */

    //endregion

    //region COUNT, AVG and SUM

    /*
     * COUNT: returns the number of items in result-set
     * AVG: returns the average numeric value of the column from result-set
     * SUM: returns the sum of all numeric values of a column from result-set
     *
     * We already saw COUNT above
     *
     * AVG example:
     * SELECT AVG(Age) AS AverageAgeOfIndianCustomers
     * FROM Customers
     * WHERE Country = 'India';
     *
     * SUM example:
     * >>SELECT SUM(AMOUNT) AS BillAmount
     * >>FROM Receipts
     * >>WHERE CustomerId = 1234  AND ProductId IS NOT NULL;
     *
     */

    //endregion

    //region LIKE

    /*
     * LIKE keywords is used in WHERE clause to specify a pattern on a column data, like
     * find all the names that start with S patten: 'S%'
     *
     * syntax:
     * WHERE column LIKE pattern;
     *
     * Wild-cards used with LIKE keyword % --> matches all(equivalent *)
     *                                   _ --> matches one character(equivalent .) underscore
     * Name that start with any letter and has ium in it = '_ium"
     *
     * patterns:
     * '%s' - words that end with 's'
     * '_ike' - words that has any character but ends with ike like hike or mike
     *
     * usage: WHERE Name LIKE 'S%';
     */

    //endregion

    //region Wildcards

    /*
     * Wildcards are substituted by one or more characters while matching with pattern in WHERE clause using LIKE
     *
     * % -> any number of chars can be matched
     * _ -> one character is matched
     * [] -> match any one character specified in [] like 'h[oa]t' can be hot or hat
     * ! -> match to any char that is not in [] like h[!oa]t can be hit but not hot or hat
     * - -> represents a range of characters like h[a-z]t, can be aby thing that is three characters and start with h
     *                                                              and ends with t
     * # -> represents and single numeric character, like 1#0 == 100, 110, 120 ..
     */

    //endregion

    //region IN, NOT IN keyword

    /*
     * IN keyword is shorthand for multiple OR conditions and also used to combine two queries on a column name
     *
     * example:
     * >>SELECT *
     * >>FROM Customers
     * >>WHERE Country IN ('India', 'USA');
     *
     * example: To selects customers who have placed orders
     * >>SELECT *
     * >>FROM Customers
     * >>WHERE Country IN (SELECT Country FROM ORDERS);
     */

    //endregion

    //region BETWEEN and NOT BETWEEN

    /*
     * This key word is used to select a range of numeric or text or date values
     *
     * BETWEEN syntax:
     * WHERE column BETWEEN value1 AND value2;
     *
     * NOT BETWEEN syntax:
     * WHERE column NOT BETWEEN value1 AND value2;
     */

    //endregion

    //region ALIAS

    /*
     * These are just to modify/format the result-set the way it prints for more readability. These exists only for the
     * duration of the query
     *
     * Column Name alias syntax:
     * >>SELECT Column AS MoreReadableColumn
     * >>FROM Table
     *
     * Table Name Alias syntax;
     * >>SELECT Column
     * >>FROM Table AS MoreReadableTable
     *
     * When more than two tables are involved in a query
     * example:
     * >>SELECT c.CustomerName, r.ReceiptNumber
     * >>FROM Customers AS c, Receipts AS r
     * >>WHERE c.CustomerId == o.CustomerId
     *
     */
    //endregion

    //region JOINS Intro

    /*
     * A JOIN clause is used to combine rows from two or more tables, based on a related column between them.
     * Types of JOINS:
     * 1. INNER JOIN  -- only combination or intersection elements
     * 2. LEFT OUTER JOIN -- intersection plus all elements from left
     * 3. RIGHT OUTER JOIN -- intersection plus all elements from right
     * 4. FULL OUTER JOIN -- everything
     */

    //endregion

    //region INNER JOIN

    /*
     * INNER JOIN: selects records that have matching values in both tables.
     *
     * Uses: only interested in intersection part
     * syntax:
     * SELECT column
     * FROM Table1
     * INNER JOIN Table2
     * ON Table1.column1 == Table2.column1;
     */

    //endregion

    //region LEFT JOIN

    /*
     * The LEFT JOIN keyword returns all records from the left table (table1), and the matched records from the right
     * table (table2). The result is NULL from the right side, if there is no match.
     *
     * syntax:
     * >>SELECT column
     * >>FROM Table1
     * >>LEFT JOIN Table2
     * >>ON Table1.column1 = Table2.column1
     */
    //endregion

    //region RIGHT JOIN

    /*
     * The RIGHT JOIN keyword returns all records from the right table (table2), and the matched records from the left
     * table (table1). The result is NULL from the left side, when there is no match.
     *
     * syntax:
     * >>SELECT column
     * >>FROM Table1
     * >>RIGHT JOIN Table2
     * >>ON Table1.column1 = Table2.column;
     */
    //endregion

    //region FULL JOIN

    /*
     * returns all records when there is a match in left (table1) or right (table2) table records.
     *
     * syntax:
     * >>SELECT *
     * >>FROM Table1
     * >>FULL JOIN Table2
     * >>ON Table1.column1 = Table2.column1;
     */
    //endregion

    //region SELF JOIN

    /*
     * A self JOIN is a regular join, but the table is joined with itself.
     *
     * Finding customers from same city
     *
     * syntax:
     * SELECT c1.CustomerName , c2.CustomerName
     * FROM Customers AS c1, Customers AS c2
     * WHERE c1.City = c2.City;
     */
    //endregion

    //region UNION

    /*
     * To combine the result-sets of two SELECT queries.
     * Conditions:
     * 1. Same number of columns,
     * 2. Same type of data types, and
     * 3. in same order
     *
     * syntax:
     * SELECT * FROM Table1 WHERE condition1;
     * UNION
     * SELECT * FROM Table1 WHERE condition2;
     *
     */

    //endregion

    //region GROUP BY

    /*
     * The GROUP BY statement groups rows that have the same values into summary rows, like "find the number of customers
     * in each country".
     *
     * The GROUP BY statement is often used with aggregate functions (COUNT, MAX, MIN, SUM, AVG) to group the
     * result-set by one or more columns.
     *
     * syntax:
     * >>SELECT column1
     * >>FROM Table1
     * >>GROUP BY column2;
     *
     * example:
     * >>SELECT COUNT(CustomerName), Country
     * >>FROM Customers
     * >>GROUP BY Country;
     */
    //endregion

    //region HAVING

    /*
     *The HAVING clause was added to SQL because the WHERE keyword could not be used with aggregate functions.
     *
     * syntax:
     * >>SELECT *
     * >>FROM Table1
     * >>WHERE condition1
     * >>GROUP BY column1
     * >>HAVING condition
     *
     * example:
     * >>SELECT COUNT(CustomerName), Country
     * >>FROM Customers
     * >>GROUP BY Country
     * >>HAVING COUNT(CustomerName) > 5;
     */

    //endregion

    //region EXISTS

    /*
     *The EXISTS operator is used to test for the existence of any record in a sub-query.
     * The EXISTS operator returns true if the sub-query returns one or more records.
     *
     * syntax:
     * >>SELECT column
     * >>FROM Table1
     * >>WHERE EXISTS
     * >>(SELECT column FROM Table2 WHERE condition);
     */

    //endregion

    //region ANY and ALL

    /**
     * The ANY and ALL operators are used with a WHERE or HAVING clause.
     *
     * The ANY operator returns true if any of the sub-query values meet the condition.
     * The ALL operator returns true if all of the sub-query values meet the condition.
     */
    //endregion






}
