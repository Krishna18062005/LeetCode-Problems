class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int ans[]=new int[nums.length];
        int temp=1;//Math.pow(2,maximumBit)-1;
        //asSaidInPs k<2^maxbit i took 2^maxbit-1
        for(int  i=0;i<maximumBit;i++) temp*=2;
        temp-=1;//for -1
        //performing n times        
        for(int i=0;i<nums.length;i++){
            temp^=nums[i];//runwith 0;
            ans[nums.length-1-i]=temp; //store it in reverse Order
        }
        return ans;
    }
}