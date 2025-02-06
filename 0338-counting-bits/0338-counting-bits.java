class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n + 1];
        for(int i = 1; i <= n; i++){
            dp[i] = dp[i / 2] + i % 2;
            
        }        
        return dp;
    }
}