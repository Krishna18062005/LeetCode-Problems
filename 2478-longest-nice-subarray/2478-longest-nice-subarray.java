class Solution {
    public int longestNiceSubarray(int[] nums) {
        int start = 0, end = 0, result = 0;
        int xor = 0, sum = 0, count = 0;
        while(end < nums.length){
            xor ^= nums[end];
            sum += nums[end++];
            count++;
            while(count != 1 && start < end && xor != sum){
                xor ^= nums[start];
                sum -= nums[start++];
                count--;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}