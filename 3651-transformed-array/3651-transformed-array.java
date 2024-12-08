class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] rslt=new int[nums.length];
        for(int i =0 ;i<nums.length;i++){
                if(nums[i]>=0){
                    int j=i+nums[i];
                    j=j%nums.length;
                    rslt[i]=nums[j];
                }
                else{
                    int d=Math.abs(nums[i]);
                    int j=i;
                    for(int k=0;k<d;k++){
                        j--;
                        if(j==-1){
                            j=nums.length-1;
                        }
                    }
                    rslt[i]=nums[j];}
            }
            
        
        return rslt;
    }
}