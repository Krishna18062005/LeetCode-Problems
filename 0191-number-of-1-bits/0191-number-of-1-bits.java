public class Solution {
    
    public int hammingWeight(int n) {
        int a=0;
        while(n!=0){           
            a+=(n&1);
            n>>=1;
            }
            System.gc();
        return a;
    }
}