class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n + 1];
        for(int i = 1; i <= n; i+=2 ){
            dp[i] = dp[i / 2] + i % 2;
            if(i!=n)
            dp[(i+1)]=dp[(i+1) / 2] + (i+1)%2;
        }        
        return dp;
    }
}