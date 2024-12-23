/* Write your T-SQL query statement below */
select tweet_id from Tweets where LEN(content)>15;