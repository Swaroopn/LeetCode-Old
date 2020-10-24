# Write your MySQL query statement below

select customers.name as 'Customers'
from customers
where customers.id not in
(
    select customerid from orders
);

SELECT Name as 'Customers'
FROM Customers
WHERE Id NOT IN ( 
    SELECT C.Id
    FROM Customers C, Orders O
    WHERE C.Id = O.CustomerId
);