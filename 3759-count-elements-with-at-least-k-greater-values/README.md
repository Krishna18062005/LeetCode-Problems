<h2><a href="https://leetcode.com/problems/count-elements-with-at-least-k-greater-values/">4141. Count Elements With at Least K Greater Values</a></h2><h3>Medium</h3><hr><p>You are given an integer array <code>nums</code> of length <code>n</code> and an integer <code>k</code>.</p>

<p>An element in <code>nums</code> is said to be <strong>qualified</strong> if there exist <strong>at least</strong> <code>k</code> elements in the array that are <strong>strictly greater</strong> than it.</p>

<p>Return an integer denoting the total number of qualified elements in <code>nums</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [3,1,2], k = 1</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<p>The elements 1 and 2 each have at least <code>k = 1</code> element greater than themselves.<br />
​​​​​​​No element is greater than 3. Therefore, the answer is 2.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [5,5,5], k = 2</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p>Since all elements are equal to 5, no element is greater than the other. Therefore, the answer is 0.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n == nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>0 &lt;= k &lt; n</code></li>
</ul>
