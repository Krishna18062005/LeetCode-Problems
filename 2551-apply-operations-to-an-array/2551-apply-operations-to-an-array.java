class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i+1<nums.length;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
                i++;
            }
            else{
                continue;
            }
        }
        int k=0;
        for(int i:nums){
            if(i!=0) nums[k++]=i;

        }
        for(int i=k;i<nums.length;i++){
            nums[k++]=0;
        }
        return nums;
    }
}