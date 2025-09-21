class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=nums[0];
        long min=nums[0];
        for(int i:nums){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        return (max-min)*k;
    }
}