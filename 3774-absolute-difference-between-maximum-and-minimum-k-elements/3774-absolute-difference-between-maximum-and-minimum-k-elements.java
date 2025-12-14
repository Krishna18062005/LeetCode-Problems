class Solution {
    public int absDifference(int[] nums, int k) {
        int f=0;
        int l=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            f+=nums[i];
            l+=nums[nums.length-i-1];
        }
        return (int)Math.abs(f-l);


    }
}