class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        long s=0;
        while(n>0){
            int r=n%10;
            if(r!=0)
            ans=ans*10+r;
            s+=r;n/=10;
        }
        long rev=0;
        while(ans>0){
            int r=(int)(ans%10);
            rev=rev*10+r;
            ans/=10;
        }
        return rev*s;
    }
}