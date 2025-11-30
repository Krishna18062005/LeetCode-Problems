class Solution {
    public int countElements(int[] nums, int k) {
       int n = nums.length;
        if(k == 0) return n;
        Arrays.sort(nums);
       
        int te = nums[n - k];
        int c = 0;
        for(int num : nums){
            if(num < te) c++;
        }
        return c;
        
    }
}