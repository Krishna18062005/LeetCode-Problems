class Solution {
    public int numberOfMatches(int n) {
        int ans=0;
        while(n>1){
            ans+=(n/2);
            n-=n/2;
        }
        return ans;
    }
}