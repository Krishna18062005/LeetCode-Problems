# Write your MySQL query statement below
select max(num) as num
from (select num,count(*) as cnt 
from mynumbers 
group by num
having cnt = 1) a