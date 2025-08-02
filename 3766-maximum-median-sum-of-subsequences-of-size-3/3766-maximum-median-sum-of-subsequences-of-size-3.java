class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        long ans=0l;
        int len=nums.length;
        for(int i=len-2;i>=len/3;i-=2){
            ans+=nums[i];
        }
        return ans;
    }
}