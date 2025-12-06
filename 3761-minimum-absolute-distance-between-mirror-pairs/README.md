<h2><a href="https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs">4139. Minimum Absolute Distance Between Mirror Pairs</a></h2><h3>Medium</h3><hr><p>You are given an integer array <code>nums</code>.</p>

<p>A <strong>mirror pair</strong> is a pair of indices <code>(i, j)</code> such that:</p>

<ul>
	<li><code>0 &lt;= i &lt; j &lt; nums.length</code>, and</li>
	<li><code>reverse(nums[i]) == nums[j]</code>, where <code>reverse(x)</code> denotes the integer formed by reversing the digits of <code>x</code>. Leading zeros are omitted after reversing, for example <code>reverse(120) = 21</code>.</li>
</ul>

<p>Return the <strong>minimum</strong> absolute distance between the indices of any mirror pair. The absolute distance between indices <code>i</code> and <code>j</code> is <code>abs(i - j)</code>.</p>

<p>If no mirror pair exists, return <code>-1</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [12,21,45,33,54]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<p>The mirror pairs are:</p>

<ul>
	<li>(0, 1) since <code>reverse(nums[0]) = reverse(12) = 21 = nums[1]</code>, giving an absolute distance <code>abs(0 - 1) = 1</code>.</li>
	<li>(2, 4) since <code>reverse(nums[2]) = reverse(45) = 54 = nums[4]</code>, giving an absolute distance <code>abs(2 - 4) = 2</code>.</li>
</ul>

<p>The minimum absolute distance among all pairs is 1.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [120,21]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<p>There is only one mirror pair (0, 1) since <code>reverse(nums[0]) = reverse(120) = 21 = nums[1]</code>.</p>

<p>The minimum absolute distance is 1.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [21,120]</span></p>

<p><strong>Output:</strong> <span class="example-io">-1</span></p>

<p><strong>Explanation:</strong></p>

<p>There are no mirror pairs in the array.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code>​​​​​​​</li>
</ul>
