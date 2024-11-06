class Solution {
    
    void swap(int [] nums, int leftIndex, int rightIndex) {
        int temp = nums[leftIndex];
        nums[leftIndex] = nums[rightIndex];
        nums[rightIndex] = temp;
    }

    public boolean canSortArray(int[] nums) {    
        int n = nums.length;
        
        for(int i = 1; i < n; i++) {
            if(nums[i] >= nums[i-1]) continue;
            else {
                if(Integer.bitCount(nums[i]) == Integer.bitCount(nums[i-1])) 
                    swap(nums, i, i - 1);
                else return false;
            }
        }

        for(int i = n - 1; i >= 1 ;i--) {
            if(nums[i] >= nums[i-1]) continue;
            else {
                if(Integer.bitCount(nums[i]) == Integer.bitCount(nums[i-1])) 
                    swap(nums, i, i - 1);
                else return false;
            }
        }
        return true;
    }
}