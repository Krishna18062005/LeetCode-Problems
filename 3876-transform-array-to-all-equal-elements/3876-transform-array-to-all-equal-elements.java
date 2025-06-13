class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        int for1 = help(nums.clone(), 1);
        if (for1 <= k)
            return true;
        int for2 = help(nums.clone(), -1);
        // System.out.print(for1+" "+for2);
        return for2 <= k;
    }

    public static int help(int[] nums, int ta) {
        int c = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != ta) {
                c++;
                nums[i - 1] *= -1;
                nums[i] *= -1;
            }
        }
        if (nums[nums.length - 1] != ta)
            return Integer.MAX_VALUE;
        return c;
    }
}