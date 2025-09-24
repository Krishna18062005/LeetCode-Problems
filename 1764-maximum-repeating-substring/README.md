<h2><a href="https://leetcode.com/problems/maximum-repeating-substring">1764. Maximum Repeating Substring</a></h2><h3>Easy</h3><hr><p>For a string <code>sequence</code>, a string <code>word</code> is <strong><code>k</code>-repeating</strong> if <code>word</code> concatenated <code>k</code> times is a substring of <code>sequence</code>. The <code>word</code>&#39;s <strong>maximum <code>k</code>-repeating value</strong> is the highest value <code>k</code> where <code>word</code> is <code>k</code>-repeating in <code>sequence</code>. If <code>word</code> is not a substring of <code>sequence</code>, <code>word</code>&#39;s maximum <code>k</code>-repeating value is <code>0</code>.</p>

<p>Given strings <code>sequence</code> and <code>word</code>, return <em>the <strong>maximum <code>k</code>-repeating value</strong> of <code>word</code> in <code>sequence</code></em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> sequence = &quot;ababc&quot;, word = &quot;ab&quot;
<strong>Output:</strong> 2
<strong>Explanation: </strong>&quot;abab&quot; is a substring in &quot;<u>abab</u>c&quot;.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> sequence = &quot;ababc&quot;, word = &quot;ba&quot;
<strong>Output:</strong> 1
<strong>Explanation: </strong>&quot;ba&quot; is a substring in &quot;a<u>ba</u>bc&quot;. &quot;baba&quot; is not a substring in &quot;ababc&quot;.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> sequence = &quot;ababc&quot;, word = &quot;ac&quot;
<strong>Output:</strong> 0
<strong>Explanation: </strong>&quot;ac&quot; is not a substring in &quot;ababc&quot;. 
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= sequence.length &lt;= 100</code></li>
	<li><code>1 &lt;= word.length &lt;= 100</code></li>
	<li><code>sequence</code> and <code>word</code>&nbsp;contains only lowercase English letters.</li>
</ul>
