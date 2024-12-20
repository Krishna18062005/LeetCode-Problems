# Write your MySQL query statement below
select distinct user_id,count(follower_id) as followers_count
from followers
group by 1
order by 1
