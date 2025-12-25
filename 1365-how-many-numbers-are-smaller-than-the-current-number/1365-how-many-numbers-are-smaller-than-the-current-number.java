class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]=new int[nums.length];
        int ind=0;
        for(int i:nums){
            int c=0;
            for(int j:nums){
                if(i>j) c++;
            }
            ans[ind++]=c;
        }
        return ans;
    }
}