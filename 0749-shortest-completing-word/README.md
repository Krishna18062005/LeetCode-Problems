<h2><a href="https://leetcode.com/problems/shortest-completing-word">749. Shortest Completing Word</a></h2><h3>Easy</h3><hr><p>Given a string <code>licensePlate</code> and an array of strings <code>words</code>, find the <strong>shortest completing</strong> word in <code>words</code>.</p>

<p>A <strong>completing</strong> word is a word that <strong>contains all the letters</strong> in <code>licensePlate</code>. <strong>Ignore numbers and spaces</strong> in <code>licensePlate</code>, and treat letters as <strong>case insensitive</strong>. If a letter appears more than once in <code>licensePlate</code>, then it must appear in the word the same number of times or more.</p>

<p>For example, if <code>licensePlate</code><code> = &quot;aBc 12c&quot;</code>, then it contains letters <code>&#39;a&#39;</code>, <code>&#39;b&#39;</code> (ignoring case), and <code>&#39;c&#39;</code> twice. Possible <strong>completing</strong> words are <code>&quot;abccdef&quot;</code>, <code>&quot;caaacab&quot;</code>, and <code>&quot;cbca&quot;</code>.</p>

<p>Return <em>the shortest <strong>completing</strong> word in </em><code>words</code><em>.</em> It is guaranteed an answer exists. If there are multiple shortest <strong>completing</strong> words, return the <strong>first</strong> one that occurs in <code>words</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> licensePlate = &quot;1s3 PSt&quot;, words = [&quot;step&quot;,&quot;steps&quot;,&quot;stripe&quot;,&quot;stepple&quot;]
<strong>Output:</strong> &quot;steps&quot;
<strong>Explanation:</strong> licensePlate contains letters &#39;s&#39;, &#39;p&#39;, &#39;s&#39; (ignoring case), and &#39;t&#39;.
&quot;step&quot; contains &#39;t&#39; and &#39;p&#39;, but only contains 1 &#39;s&#39;.
&quot;steps&quot; contains &#39;t&#39;, &#39;p&#39;, and both &#39;s&#39; characters.
&quot;stripe&quot; is missing an &#39;s&#39;.
&quot;stepple&quot; is missing an &#39;s&#39;.
Since &quot;steps&quot; is the only word containing all the letters, that is the answer.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> licensePlate = &quot;1s3 456&quot;, words = [&quot;looks&quot;,&quot;pest&quot;,&quot;stew&quot;,&quot;show&quot;]
<strong>Output:</strong> &quot;pest&quot;
<strong>Explanation:</strong> licensePlate only contains the letter &#39;s&#39;. All the words contain &#39;s&#39;, but among these &quot;pest&quot;, &quot;stew&quot;, and &quot;show&quot; are shortest. The answer is &quot;pest&quot; because it is the word that appears earliest of the 3.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= licensePlate.length &lt;= 7</code></li>
	<li><code>licensePlate</code> contains digits, letters (uppercase or lowercase), or space <code>&#39; &#39;</code>.</li>
	<li><code>1 &lt;= words.length &lt;= 1000</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 15</code></li>
	<li><code>words[i]</code> consists of lower case English letters.</li>
</ul>
