class Solution {
    public int[] closestPrimes(int left, int right) {
        
        boolean first=false;
        int fn=-1;
        int sn=-1;
         int min=Integer.MAX_VALUE;
        int ans1=-1;
        int ans2=-1;
        for(int i=left;i<=right;i++){
            if(isp(i)){
                if(!first){
                    fn=i;
                    first=true;
                    continue;
                }
                sn=i;

                 if(fn!=-1&&sn!=-1&&min>Math.abs(fn-sn)){
                ans1=fn;
                ans2=sn;
                min=Math.abs(fn-sn);
            }
            fn=sn;
            sn=-1;
                
            }
        }
       
        
        int[] ans={ans1,ans2};
        return ans;

    }
    public static boolean isp(int a){
        if(a<=1)return false;
        if(a<=3) return true;
        if(a%2==0||a%3==0) return false;
        for(int i=4;i*i<=a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
}