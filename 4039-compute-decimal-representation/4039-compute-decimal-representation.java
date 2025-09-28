class Solution {
    public int[] decimalRepresentation(int n) {
        int temp=n;
        int nz=0;
        while(temp>0){
            if(temp%10!=0) nz++;
            temp/=10;
        }
        int[] ans=new int[nz];
        int d=0;
        while(n>0){
            int r=n%10;
            n/=10;
            if(r!=0)
            ans[--nz]=r*(int)Math.pow(10,d);
            d++;
        }
        return ans;
    }
}