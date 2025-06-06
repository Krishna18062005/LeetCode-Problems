class Solution {
    public int[] leftRightDifference(int[] nums) {

        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = sum;
            sum += nums[i];
        }
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = Math.abs(ans[i] - sum);
            sum += nums[i];
        }
        return ans;
    }
}