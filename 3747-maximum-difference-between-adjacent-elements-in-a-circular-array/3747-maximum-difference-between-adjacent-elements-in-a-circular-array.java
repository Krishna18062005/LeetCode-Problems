class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=0;i<nums.length-1;i++){
            if(ans<Math.abs(nums[i]-nums[i+1]))
            ans=Math.abs(nums[i]-nums[i+1]);
        }
        return ans;
    }
}