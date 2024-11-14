class Solution {
    public int hammingDistance(int x, int y) {
        int c=0;
        int k=x^y;
        while(k>0)
        {
            
            c+=(k&1);
            k>>=1;
        
        }
        return c;
    }
}