class Solution {
    public int pivotInteger(int n) {
        if(n<=1) return n;
        long s=(n*(n+1))/2;
        int cs=0;
        for(int i=1;i<=n;i++){
            cs+=i;
           
            if(cs*2-i==s) return i;
        }
        return -1;
    }
}