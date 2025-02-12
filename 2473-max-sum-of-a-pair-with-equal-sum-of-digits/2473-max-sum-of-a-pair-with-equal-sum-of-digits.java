class Solution {
    public int maximumSum(int[] nums) {
        int ans=-1;
       
        int[] ar=new int[82];
        for(int i:nums){
            int s=0;
            int t=i;
            while(t>0){
                s+=t%10;
                t/=10;
            }
            if(ar[s]==0){
                
                ar[s]=i;

            }
            else{
                ans=Math.max(i+ar[s],ans);
                int mxx=Math.max(i,ar[s]);
                ar[s]=mxx;
            }
        }
       
       
        return ans;

    }
}