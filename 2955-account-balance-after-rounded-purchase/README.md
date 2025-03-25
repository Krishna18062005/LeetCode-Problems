<h2><a href="https://leetcode.com/problems/account-balance-after-rounded-purchase">2955. Account Balance After Rounded Purchase</a></h2><h3>Easy</h3><hr><p>Initially, you have a bank account balance of <strong>100</strong> dollars.</p>

<p>You are given an integer <code>purchaseAmount</code> representing the amount you will spend on a purchase in dollars, in other words, its price.</p>

<p>When making the purchase, first the <code>purchaseAmount</code> <strong>is rounded to the nearest multiple of 10</strong>. Let us call this value <code>roundedAmount</code>. Then, <code>roundedAmount</code> dollars are removed from your bank account.</p>

<p>Return an integer denoting your final bank account balance after this purchase.</p>

<p><strong>Notes:</strong></p>

<ul>
	<li>0 is considered to be a multiple of 10 in this problem.</li>
	<li>When rounding, 5 is rounded upward (5 is rounded to 10, 15 is rounded to 20, 25 to 30, and so on).</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">purchaseAmount = 9</span></p>

<p><strong>Output:</strong> <span class="example-io">90</span></p>

<p><strong>Explanation:</strong></p>

<p>The nearest multiple of 10 to 9 is 10. So your account balance becomes 100 - 10 = 90.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">purchaseAmount = 15</span></p>

<p><strong>Output:</strong> <span class="example-io">80</span></p>

<p><strong>Explanation:</strong></p>

<p>The nearest multiple of 10 to 15 is 20. So your account balance becomes 100 - 20 = 80.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">purchaseAmount = 10</span></p>

<p><strong>Output:</strong> <span class="example-io">90</span></p>

<p><strong>Explanation:</strong></p>

<p>10 is a multiple of 10 itself. So your account balance becomes 100 - 10 = 90.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= purchaseAmount &lt;= 100</code></li>
</ul>
