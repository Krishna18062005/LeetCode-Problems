class Solution {
    public int maxSubArray(int[] nums) {
        int a=0;
        int b=nums[0];
        
        
        for(int i:nums){
           a+=i;
           b=Math.max(a,b);
           if(a<0){
               a=0;
           }
        }
     
      return b;  
    }
}