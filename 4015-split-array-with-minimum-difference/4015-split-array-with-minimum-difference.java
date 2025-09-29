class Solution {
    public long splitArray(int[] nums) {
        int left=0;
        int right=nums.length-1;
        long leftSum=0l;
        while(left<right&&nums[left]<nums[left+1]){
            leftSum+=nums[left];
            left++;
        }
        long rightSum=0l;
        while(right>0&&nums[right]<nums[right-1]){
            rightSum+=nums[right];
            right--;
        }
       // System.out.println(leftSum+" "+rightSum);
        if(left==right){
            long first=(long)Math.abs(leftSum+nums[left]-rightSum);
            long last=(long)Math.abs(leftSum-(rightSum+nums[left]));
            return (long)Math.min(first,last);
        }
        else if(left+1==right){
            return (long)Math.abs(leftSum-rightSum);
        }

        return -1;
    }
}