class Solution {
    public int maxProduct(int n) {
        int fmax=0;
        int smax=0;
        while(n!=0){
            int nu=n%10;
            n/=10;
            if(fmax<nu){
                smax=fmax;
                fmax=nu;
            }
            else if(smax<nu){
                smax=nu;
            }

        }
        return fmax*smax;
    }
}