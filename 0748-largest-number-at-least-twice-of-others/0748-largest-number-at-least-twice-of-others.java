class Solution {
    public int dominantIndex(int[] nums) {
        int mi=0;
        int max=0;
        int smax=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                mi=i;
                smax=max;
                max=nums[i];
            }
            else if(smax<nums[i]){
                smax=nums[i];
                            }
        }
        return ((smax*2)<=max)?mi:-1;

        
    }
}