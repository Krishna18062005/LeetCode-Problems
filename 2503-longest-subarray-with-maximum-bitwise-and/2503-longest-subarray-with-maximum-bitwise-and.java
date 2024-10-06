class Solution {
    public int longestSubarray(int[] nums) {
        int m=nums[0];
        int c=0;
        int ans=0;
        for(int i:nums) m=Math.max(i,m);
        for(int i:nums){
            if(m==i){
                c++;
                ans=Math.max(ans,c);
            }
            else c=0;

        }
        return ans;
    }
}