class Solution {
    public int countDigits(int num) {
        int dp=num;
        int ans=0;
        while(num>0){
            int r=num%10;
            num/=10;
            if(dp%r==0) ans++;
        }
        return ans;
    }
}