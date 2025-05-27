class Solution {
    public int differenceOfSums(int n, int m) {
        int ds=0;
        int nds=0;
        for(int i=1;i<=n;i++){
            if(i%m==0) ds+=i;
            else nds+=i;
        }
        return nds-ds;
    }
}