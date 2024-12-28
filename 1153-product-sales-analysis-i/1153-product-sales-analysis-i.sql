# Write your MySQL query statement below
select product_name,sales.year,sales.price from sales, product where product.product_id=sales.product_id;