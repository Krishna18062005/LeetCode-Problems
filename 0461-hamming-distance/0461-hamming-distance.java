class Solution {
    public int hammingDistance(int x, int y) {
        int c=0;
        while(x>0||y>0)
        {
            int x1=x&1;
            int y1=y&1;
            c+=(x1^y1);
            x>>=1;
            y>>=1;
        }
        return c;
    }
}