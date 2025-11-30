class Solution {
    public int countElements(int[] nums, int k) {
       int n = nums.length;
        if(k == 0) return n;
        Arrays.sort(nums);
        int t = n - k;
        int tv = nums[t];
        int count = 0;
        for(int num : nums){
            if(num < tv) count++;
        }
        return count;
        
    }
}