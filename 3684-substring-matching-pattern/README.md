<h2><a href="https://leetcode.com/problems/substring-matching-pattern">3684. Substring Matching Pattern</a></h2><h3>Easy</h3><hr><p>You are given a string <code>s</code> and a pattern string <code>p</code>, where <code>p</code> contains <strong>exactly one</strong> <code>&#39;*&#39;</code> character.</p>

<p>The <code>&#39;*&#39;</code> in <code>p</code> can be replaced with any sequence of zero or more characters.</p>

<p>Return <code>true</code> if <code>p</code> can be made a substring of <code>s</code>, and <code>false</code> otherwise.</p>

<p>A <strong>substring</strong> is a contiguous <b>non-empty</b> sequence of characters within a string.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;leetcode&quot;, p = &quot;ee*e&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<p>By replacing the <code>&#39;*&#39;</code> with <code>&quot;tcod&quot;</code>, the substring <code>&quot;eetcode&quot;</code> matches the pattern.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;car&quot;, p = &quot;c*v&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p><strong>Explanation:</strong></p>

<p>There is no substring matching the pattern.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;luck&quot;, p = &quot;u*&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<p>The substrings <code>&quot;u&quot;</code>, <code>&quot;uc&quot;</code>, and <code>&quot;uck&quot;</code> match the pattern.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 50</code></li>
	<li><code>1 &lt;= p.length &lt;= 50 </code></li>
	<li><code>s</code> contains only lowercase English letters.</li>
	<li><code>p</code> contains only lowercase English letters and exactly one <code>&#39;*&#39;</code></li>
</ul>
