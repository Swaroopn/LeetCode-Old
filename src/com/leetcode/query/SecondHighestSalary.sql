# Write your MySQL query statement below

SELECT MAX(Salary) as SecondHighestSalary
FROM Employee
WHERE Salary < ( SELECT MAX(Salary) FROM Employee );

SELECT DISTINCT Salary AS SecondHighestSalary
FROM Employee
ORDER BY Salary DESC
LIMIT 1 OFFSET 1;