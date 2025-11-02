class Solution {
    public long maxProduct(int[] nums) {
        int max1=0;
        int max2=0;
        long ans=100000;
        for(int i:nums){
            int abs=Math.abs(i);
            if(max1<abs){
                max2=max1;
                max1=abs;
            }
            else if(max2<abs){
                max2=abs;
            }
        }
        return ans*max1*max2;
    }
}