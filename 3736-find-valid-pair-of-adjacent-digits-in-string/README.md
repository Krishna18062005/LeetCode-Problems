<h2><a href="https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string">3736. Find Valid Pair of Adjacent Digits in String</a></h2><h3>Easy</h3><hr><p>You are given a string <code>s</code> consisting only of digits. A <strong>valid pair</strong> is defined as two <strong>adjacent</strong> digits in <code>s</code> such that:</p>

<ul>
	<li>The first digit is <strong>not equal</strong> to the second.</li>
	<li>Each digit in the pair appears in <code>s</code> <strong>exactly</strong> as many times as its numeric value.</li>
</ul>

<p>Return the first <strong>valid pair</strong> found in the string <code>s</code> when traversing from left to right. If no valid pair exists, return an empty string.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;2523533&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;23&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>Digit <code>&#39;2&#39;</code> appears 2 times and digit <code>&#39;3&#39;</code> appears 3 times. Each digit in the pair <code>&quot;23&quot;</code> appears in <code>s</code> exactly as many times as its numeric value. Hence, the output is <code>&quot;23&quot;</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;221&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;21&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>Digit <code>&#39;2&#39;</code> appears 2 times and digit <code>&#39;1&#39;</code> appears 1 time. Hence, the output is <code>&quot;21&quot;</code>.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;22&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>There are no valid adjacent pairs.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> only consists of digits from <code>&#39;1&#39;</code> to <code>&#39;9&#39;</code>.</li>
</ul>
