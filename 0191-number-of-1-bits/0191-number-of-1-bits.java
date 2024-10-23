public class Solution {
    
    public int hammingWeight(int n) {
        short a=0;
        while(n!=0){           
            a+=(n&1);
            n>>=1;
            }
        return (int)a;
    }
}