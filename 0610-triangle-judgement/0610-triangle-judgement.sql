# Write your MySQL query statement below
SELECT 
    x,
    y,
    z,
    (CASE WHEN x < y + z AND y < x + z AND z < x + y THEN "Yes" ELSE "No" END) AS triangle
FROM Triangle;