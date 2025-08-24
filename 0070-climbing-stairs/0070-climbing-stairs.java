class Solution {
    public int climbStairs(int n) {
        if(n<=1)
            return 1;
        int[] dp=new int[n+1];
       
        return f(n,dp);
        
    }
    public static int f(int n,int[] dp){
        if(n==-1) return 0;
        if(dp[n]!=0) return dp[n];
        if(n==0) return dp[n]=1;
        return dp[n]=f(n-1,dp)+f(n-2,dp);
    
    }
}