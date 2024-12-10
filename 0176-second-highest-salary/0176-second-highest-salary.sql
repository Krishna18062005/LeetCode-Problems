# Write your MySQL query statement below
select max(salary) as SecondHighestSalary
from Employee where salary < (select max(salary) from Employee)