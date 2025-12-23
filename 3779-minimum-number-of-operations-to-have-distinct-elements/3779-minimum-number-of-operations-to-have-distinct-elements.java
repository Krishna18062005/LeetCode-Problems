class Solution {
    public int minOperations(int[] nums) {
        int[] hash = new int[100001];
        int i = 0;
        for(i = nums.length - 1; i >= 0; i--) {
            if(hash[nums[i]] == 1) break;
            hash[nums[i]] = 1;
        }
        return (i + 3) / 3;
    }
}