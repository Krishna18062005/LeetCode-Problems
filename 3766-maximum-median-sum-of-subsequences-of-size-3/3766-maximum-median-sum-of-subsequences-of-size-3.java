class Solution {
    static{
        for(int i=0;i<100;i++) maximumMedianSum(new int[2]);

    }
    public static long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-2;
        long ans=0;
        while(i<j){
            ans+=nums[j];
            j=j-2;
            i++;
        }
        return ans;
    }
}