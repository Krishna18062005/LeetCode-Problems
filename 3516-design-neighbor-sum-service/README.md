<h2><a href="https://leetcode.com/problems/design-neighbor-sum-service">3516. Design Neighbor Sum Service</a></h2><h3>Easy</h3><hr><p>You are given a <code>n x n</code> 2D array <code>grid</code> containing <strong>distinct</strong> elements in the range <code>[0, n<sup>2</sup> - 1]</code>.</p>

<p>Implement the <code>NeighborSum</code> class:</p>

<ul>
	<li><code>NeighborSum(int [][]grid)</code> initializes the object.</li>
	<li><code>int adjacentSum(int value)</code> returns the <strong>sum</strong> of elements which are adjacent neighbors of <code>value</code>, that is either to the top, left, right, or bottom of <code>value</code> in <code>grid</code>.</li>
	<li><code>int diagonalSum(int value)</code> returns the <strong>sum</strong> of elements which are diagonal neighbors of <code>value</code>, that is either to the top-left, top-right, bottom-left, or bottom-right of <code>value</code> in <code>grid</code>.</li>
</ul>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/06/24/design.png" style="width: 400px; height: 248px;" /></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong></p>

<p>[&quot;NeighborSum&quot;, &quot;adjacentSum&quot;, &quot;adjacentSum&quot;, &quot;diagonalSum&quot;, &quot;diagonalSum&quot;]</p>

<p>[[[[0, 1, 2], [3, 4, 5], [6, 7, 8]]], [1], [4], [4], [8]]</p>

<p><strong>Output:</strong> [null, 6, 16, 16, 4]</p>

<p><strong>Explanation:</strong></p>

<p><strong class="example"><img alt="" src="https://assets.leetcode.com/uploads/2024/06/24/designexample0.png" style="width: 250px; height: 249px;" /></strong></p>

<ul>
	<li>The adjacent neighbors of 1 are 0, 2, and 4.</li>
	<li>The adjacent neighbors of 4 are 1, 3, 5, and 7.</li>
	<li>The diagonal neighbors of 4 are 0, 2, 6, and 8.</li>
	<li>The diagonal neighbor of 8 is 4.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong></p>

<p>[&quot;NeighborSum&quot;, &quot;adjacentSum&quot;, &quot;diagonalSum&quot;]</p>

<p>[[[[1, 2, 0, 3], [4, 7, 15, 6], [8, 9, 10, 11], [12, 13, 14, 5]]], [15], [9]]</p>

<p><strong>Output:</strong> [null, 23, 45]</p>

<p><strong>Explanation:</strong></p>

<p><strong class="example"><img alt="" src="https://assets.leetcode.com/uploads/2024/06/24/designexample2.png" style="width: 300px; height: 300px;" /></strong></p>

<ul>
	<li>The adjacent neighbors of 15 are 0, 10, 7, and 6.</li>
	<li>The diagonal neighbors of 9 are 4, 12, 14, and 15.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= n == grid.length == grid[0].length &lt;= 10</code></li>
	<li><code>0 &lt;= grid[i][j] &lt;= n<sup>2</sup> - 1</code></li>
	<li>All <code>grid[i][j]</code> are distinct.</li>
	<li><code>value</code> in <code>adjacentSum</code> and <code>diagonalSum</code> will be in the range <code>[0, n<sup>2</sup> - 1]</code>.</li>
	<li>At most <code>2 * n<sup>2</sup></code> calls will be made to <code>adjacentSum</code> and <code>diagonalSum</code>.</li>
</ul>
