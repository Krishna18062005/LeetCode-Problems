<h2><a href="https://leetcode.com/problems/count-substrings-starting-and-ending-with-given-character/">3337. Count Substrings Starting and Ending with Given Character</a></h2><h3>Medium</h3><hr><p>You are given a string <code>s</code> and a character <code>c</code>. Return <em>the total number of <span data-keyword="substring-nonempty">substrings</span> of </em><code>s</code><em> that start and end with </em><code>c</code><em>.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block" style="border-color: var(--border-tertiary); border-left-width: 2px; color: var(--text-secondary); font-size: .875rem; margin-bottom: 1rem; margin-top: 1rem; overflow: visible; padding-left: 1rem;">
<p><strong>Input: </strong><span class="example-io" style="font-family: Menlo,sans-serif; font-size: 0.85rem;">s = &quot;abada&quot;, c = &quot;a&quot;</span></p>

<p><strong>Output: </strong><span class="example-io" style="font-family: Menlo,sans-serif; font-size: 0.85rem;">6</span></p>

<p><strong>Explanation:</strong> Substrings starting and ending with <code>&quot;a&quot;</code> are: <code>&quot;<strong><u>a</u></strong>bada&quot;</code>, <code>&quot;<u><strong>aba</strong></u>da&quot;</code>, <code>&quot;<u><strong>abada</strong></u>&quot;</code>, <code>&quot;ab<u><strong>a</strong></u>da&quot;</code>, <code>&quot;ab<u><strong>ada</strong></u>&quot;</code>, <code>&quot;abad<u><strong>a</strong></u>&quot;</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block" style="border-color: var(--border-tertiary); border-left-width: 2px; color: var(--text-secondary); font-size: .875rem; margin-bottom: 1rem; margin-top: 1rem; overflow: visible; padding-left: 1rem;">
<p><strong>Input: </strong><span class="example-io" style="font-family: Menlo,sans-serif; font-size: 0.85rem;">s = &quot;zzz&quot;, c = &quot;z&quot;</span></p>

<p><strong>Output: </strong><span class="example-io" style="font-family: Menlo,sans-serif; font-size: 0.85rem;">6</span></p>

<p><strong>Explanation:</strong> There are a total of <code>6</code> substrings in <code>s</code> and all start and end with <code>&quot;z&quot;</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> and <code>c</code> consist&nbsp;only of lowercase English letters.</li>
</ul>
