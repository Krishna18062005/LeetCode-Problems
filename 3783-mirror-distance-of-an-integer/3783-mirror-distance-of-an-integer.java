class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int c=n;
       while(c>0){
        rev=rev*10+(c%10);
        c/=10;
       } 
       return Math.abs(rev-n);
    }
}