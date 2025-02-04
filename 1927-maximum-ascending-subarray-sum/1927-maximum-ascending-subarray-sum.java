class Solution {
    public int maxAscendingSum(int[] nums) {
        int total = nums[0],max = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i]>nums[i-1])total+=nums[i];
            else{
                total = nums[i];
            }
            max = Math.max(total,max);
        }
        return max;
    }
}