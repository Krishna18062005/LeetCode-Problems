class Solution {
    public int waysToSplitArray(int[] nums) { 
        long s=0;
        for(int i:nums){
            s+=(long)i;
        }
        int c=0;
        long ls=0;
        for(int i=0;i<nums.length-1;i++){
            s-=nums[i];
            ls+=(long)nums[i];
            if(ls>=s){
                c++;
            }

        }
        return c;
    }
}