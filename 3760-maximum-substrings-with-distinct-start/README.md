<h2><a href="https://leetcode.com/problems/maximum-substrings-with-distinct-start">4087. Maximum Substrings With Distinct Start</a></h2><h3>Medium</h3><hr><p>You are given a string <code>s</code> consisting of lowercase English letters.</p>

<p>Return an integer denoting the <strong>maximum</strong> number of <span data-keyword="substring-nonempty">substrings</span> you can split <code>s</code> into such that each <strong>substring</strong> starts with a <strong>distinct</strong> character (i.e., no two substrings start with the same character).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;abab&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>Split <code>&quot;abab&quot;</code> into <code>&quot;a&quot;</code> and <code>&quot;bab&quot;</code>.</li>
	<li>Each substring starts with a distinct character i.e <code>&#39;a&#39;</code> and <code>&#39;b&#39;</code>. Thus, the answer is 2.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;abcd&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>Split <code>&quot;abcd&quot;</code> into <code>&quot;a&quot;</code>, <code>&quot;b&quot;</code>, <code>&quot;c&quot;</code>, and <code>&quot;d&quot;</code>.</li>
	<li>Each substring starts with a distinct character. Thus, the answer is 4.</li>
</ul>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;aaaa&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>All characters in <code>&quot;aaaa&quot;</code> are <code>&#39;a&#39;</code>.</li>
	<li>Only one substring can start with <code>&#39;a&#39;</code>. Thus, the answer is 1.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
</ul>
