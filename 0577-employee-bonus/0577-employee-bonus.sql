# Write your MySQL query statement below

select e.name,b.bonus from employee e left Join bonus b on e.empId=b.empId where b.bonus<1000 or bonus is null;

