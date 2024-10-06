class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int i=1;
        int j=0;
        int ii=0;
        while(ii<nums.length){
            if(nums[ii]<0){
                ans[i]=nums[ii];
                i+=2;
            }
            else if(nums[ii]>0){ ans[j]=nums[ii];j+=2;
        }ii++;}
        return ans;
    }
}