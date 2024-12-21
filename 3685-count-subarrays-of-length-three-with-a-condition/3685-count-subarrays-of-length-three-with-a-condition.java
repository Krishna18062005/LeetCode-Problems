class Solution {
    public int countSubarrays(int[] nums) {
        int c=0;
        for(int i=0;i+3<=nums.length;i++){
            int s=(nums[i]+nums[i+2]);
            if(s*2==(nums[i+1])) c++;
        }
        return c;
    }
}