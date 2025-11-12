<h2><a href="https://leetcode.com/problems/nth-highest-salary">177. Nth Highest Salary</a></h2><h3>Medium</h3><hr><p>Table: <code>Employee</code></p>

<pre>
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| salary      | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
Each row of this table contains information about the salary of an employee.
</pre>

<p>&nbsp;</p>

<p>Write a solution to find the <code>n<sup>th</sup></code> highest <strong>distinct</strong> salary from the <code>Employee</code> table. If there are less than <code>n</code> distinct salaries, return&nbsp;<code>null</code>.</p>

<p>The result format is in the following example.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
n = 2
<strong>Output:</strong> 
+------------------------+
| getNthHighestSalary(2) |
+------------------------+
| 200                    |
+------------------------+
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
+----+--------+
n = 2
<strong>Output:</strong> 
+------------------------+
| getNthHighestSalary(2) |
+------------------------+
| null                   |
+------------------------+
</pre>
