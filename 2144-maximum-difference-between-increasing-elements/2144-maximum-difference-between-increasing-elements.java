class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]-nums[i]>0)
                max=Math.max(nums[j]-nums[i],max);
            }
        }
        return max;
    }
}