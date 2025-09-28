class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int j=1;j<=n;j++){
            dp[j]=Integer.MAX_VALUE;
            if (j - 1 >= 0) dp[j] = Math.min(dp[j], dp[j - 1] + costs[j - 1] + 1);
            if (j - 2 >= 0) dp[j] = Math.min(dp[j], dp[j - 2] + costs[j - 1] + 4);
            if (j - 3 >= 0) dp[j] = Math.min(dp[j], dp[j - 3] + costs[j - 1] + 9);
        }
        return dp[n];
    }
}