class Solution {
    public int unequalTriplets(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i+2<n;i++){
            for(int j=i+1;j+1<n;j++){
                if(nums[i]!=nums[j])
                for(int k=j+1;k<n;k++){
                    if(nums[i]!=nums[j]&&nums[j]!=nums[k]&&nums[i]!=nums[k]) c++;
                }
            }
        }
        return c;

    }
}