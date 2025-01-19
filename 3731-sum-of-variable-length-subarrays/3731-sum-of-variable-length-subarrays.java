class Solution {
    public int subarraySum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            int srt=Math.max(0,i-nums[i]);
            for(int j=srt;j<i+1;j++){
                s+=nums[j];
            }
        }
        return s;
    }
}