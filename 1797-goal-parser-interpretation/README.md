<h2><a href="https://leetcode.com/problems/goal-parser-interpretation">1797. Goal Parser Interpretation</a></h2><h3>Easy</h3><hr><p>You own a <strong>Goal Parser</strong> that can interpret a string <code>command</code>. The <code>command</code> consists of an alphabet of <code>&quot;G&quot;</code>, <code>&quot;()&quot;</code> and/or <code>&quot;(al)&quot;</code> in some order. The Goal Parser will interpret <code>&quot;G&quot;</code> as the string <code>&quot;G&quot;</code>, <code>&quot;()&quot;</code> as the string <code>&quot;o&quot;</code>, and <code>&quot;(al)&quot;</code> as the string <code>&quot;al&quot;</code>. The interpreted strings are then concatenated in the original order.</p>

<p>Given the string <code>command</code>, return <em>the <strong>Goal Parser</strong>&#39;s interpretation of </em><code>command</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> command = &quot;G()(al)&quot;
<strong>Output:</strong> &quot;Goal&quot;
<strong>Explanation:</strong>&nbsp;The Goal Parser interprets the command as follows:
G -&gt; G
() -&gt; o
(al) -&gt; al
The final concatenated result is &quot;Goal&quot;.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> command = &quot;G()()()()(al)&quot;
<strong>Output:</strong> &quot;Gooooal&quot;
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> command = &quot;(al)G(al)()()G&quot;
<strong>Output:</strong> &quot;alGalooG&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= command.length &lt;= 100</code></li>
	<li><code>command</code> consists of <code>&quot;G&quot;</code>, <code>&quot;()&quot;</code>, and/or <code>&quot;(al)&quot;</code> in some order.</li>
</ul>
