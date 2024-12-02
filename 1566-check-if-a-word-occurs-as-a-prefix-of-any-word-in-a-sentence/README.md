<h2><a href="https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence">1566. Check If a Word Occurs As a Prefix of Any Word in a Sentence</a></h2><h3>Easy</h3><hr><p>Given a <code>sentence</code> that consists of some words separated by a <strong>single space</strong>, and a <code>searchWord</code>, check if <code>searchWord</code> is a prefix of any word in <code>sentence</code>.</p>

<p>Return <em>the index of the word in </em><code>sentence</code><em> (<strong>1-indexed</strong>) where </em><code>searchWord</code><em> is a prefix of this word</em>. If <code>searchWord</code> is a prefix of more than one word, return the index of the first word <strong>(minimum index)</strong>. If there is no such word return <code>-1</code>.</p>

<p>A <strong>prefix</strong> of a string <code>s</code> is any leading contiguous substring of <code>s</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> sentence = &quot;i love eating burger&quot;, searchWord = &quot;burg&quot;
<strong>Output:</strong> 4
<strong>Explanation:</strong> &quot;burg&quot; is prefix of &quot;burger&quot; which is the 4th word in the sentence.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> sentence = &quot;this problem is an easy problem&quot;, searchWord = &quot;pro&quot;
<strong>Output:</strong> 2
<strong>Explanation:</strong> &quot;pro&quot; is prefix of &quot;problem&quot; which is the 2nd and the 6th word in the sentence, but we return 2 as it&#39;s the minimal index.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> sentence = &quot;i am tired&quot;, searchWord = &quot;you&quot;
<strong>Output:</strong> -1
<strong>Explanation:</strong> &quot;you&quot; is not a prefix of any word in the sentence.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= sentence.length &lt;= 100</code></li>
	<li><code>1 &lt;= searchWord.length &lt;= 10</code></li>
	<li><code>sentence</code> consists of lowercase English letters and spaces.</li>
	<li><code>searchWord</code> consists of lowercase English letters.</li>
</ul>
