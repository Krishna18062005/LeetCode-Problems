class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in=1;
        int decre=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                in++;
                decre=1;
            
            max=Math.max(max,in);}
            else if(nums[i-1]>nums[i]){
                in=1;
                decre++;
            }
            else{
                in=1;
                decre=1;
            }
            max=Math.max(max,decre);

        }
        return max;
        
    }
}