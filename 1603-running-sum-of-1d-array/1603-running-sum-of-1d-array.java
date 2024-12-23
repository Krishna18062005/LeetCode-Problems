class Solution {
    public int[] runningSum(int[] nums) {
        int[] ar=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            ar[i]=s;
        }return ar;
    }
}