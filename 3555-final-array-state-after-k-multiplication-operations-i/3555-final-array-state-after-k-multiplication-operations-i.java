class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int mi=0;
            int min=nums[0];
            for(int j=0;j<nums.length;j++){
                if(min>nums[j]){
                    mi=j;
                    min=nums[j];
                }
            }
            nums[mi]*=multiplier;

        }
        return nums;
    }
}