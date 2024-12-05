<h2><a href="https://leetcode.com/problems/move-pieces-to-obtain-a-string">2414. Move Pieces to Obtain a String</a></h2><h3>Medium</h3><hr><p>You are given two strings <code>start</code> and <code>target</code>, both of length <code>n</code>. Each string consists <strong>only</strong> of the characters <code>&#39;L&#39;</code>, <code>&#39;R&#39;</code>, and <code>&#39;_&#39;</code> where:</p>

<ul>
	<li>The characters <code>&#39;L&#39;</code> and <code>&#39;R&#39;</code> represent pieces, where a piece <code>&#39;L&#39;</code> can move to the <strong>left</strong> only if there is a <strong>blank</strong> space directly to its left, and a piece <code>&#39;R&#39;</code> can move to the <strong>right</strong> only if there is a <strong>blank</strong> space directly to its right.</li>
	<li>The character <code>&#39;_&#39;</code> represents a blank space that can be occupied by <strong>any</strong> of the <code>&#39;L&#39;</code> or <code>&#39;R&#39;</code> pieces.</li>
</ul>

<p>Return <code>true</code> <em>if it is possible to obtain the string</em> <code>target</code><em> by moving the pieces of the string </em><code>start</code><em> <strong>any</strong> number of times</em>. Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> start = &quot;_L__R__R_&quot;, target = &quot;L______RR&quot;
<strong>Output:</strong> true
<strong>Explanation:</strong> We can obtain the string target from start by doing the following moves:
- Move the first piece one step to the left, start becomes equal to &quot;<strong>L</strong>___R__R_&quot;.
- Move the last piece one step to the right, start becomes equal to &quot;L___R___<strong>R</strong>&quot;.
- Move the second piece three steps to the right, start becomes equal to &quot;L______<strong>R</strong>R&quot;.
Since it is possible to get the string target from start, we return true.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> start = &quot;R_L_&quot;, target = &quot;__LR&quot;
<strong>Output:</strong> false
<strong>Explanation:</strong> The &#39;R&#39; piece in the string start can move one step to the right to obtain &quot;_<strong>R</strong>L_&quot;.
After that, no pieces can move anymore, so it is impossible to obtain the string target from start.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> start = &quot;_R&quot;, target = &quot;R_&quot;
<strong>Output:</strong> false
<strong>Explanation:</strong> The piece in the string start can move only to the right, so it is impossible to obtain the string target from start.</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == start.length == target.length</code></li>
	<li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>start</code> and <code>target</code> consist of the characters <code>&#39;L&#39;</code>, <code>&#39;R&#39;</code>, and <code>&#39;_&#39;</code>.</li>
</ul>
