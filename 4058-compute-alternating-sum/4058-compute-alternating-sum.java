class Solution {
    public int alternatingSum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s=(i%2==0)?s+nums[i]:s-nums[i];
        }
        return s;
    }
}