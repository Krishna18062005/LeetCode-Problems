class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int ans = nums[0];  

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < ans) ans = nums[mid]; 
            if (nums[mid] == nums[end]) end--; 
            else if (nums[mid] > nums[end]) start = mid + 1; 
            else end = mid;                    
        }

        return nums[start]; 
    }
}