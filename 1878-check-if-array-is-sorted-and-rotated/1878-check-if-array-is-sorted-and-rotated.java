class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                c++;
            }
            if(c>1){
                return false;
            }
            

        }if(nums[nums.length-1]>nums[0]){
                c++;
            }
        
        return c<=1;
    }
}