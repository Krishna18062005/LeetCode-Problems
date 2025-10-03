class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            res[i]=-1;
            boolean f=false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    res[i] = nums[j];
                    f=true;
                    break;
                }
            }
            if(!f)
            for(int j=0;j<i;j++){
                if (nums[j] > nums[i]) {
                    res[i] = nums[j];
                    
                    break;
                }
            }
        }
        return res;
    }
}