public class Solution {
    
    public int hammingWeight(int n) {
        
        if(n==1) return 1; 
        return ((n&1)^0)+hammingWeight(n>>1);
    }
}