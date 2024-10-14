class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in=0;
        int decre=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                in++;
                decre=0;
            
            max=Math.max(max,in);}
            else if(nums[i-1]>nums[i]){
                in=0;
                decre++;
            }
            else{
                in=0;
                decre=0;
            }
            max=Math.max(max,decre);

        }
        return max+1;
        
    }
}