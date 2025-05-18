class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=0;
            while(nums[i]!=0){
                num+=(nums[i]%10);
                nums[i]/=10;
            }
            if(num==i) return i;
        }
        return -1;
    }
}