class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int t=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=t;
            i++;
        }
        return nums;
    }
}