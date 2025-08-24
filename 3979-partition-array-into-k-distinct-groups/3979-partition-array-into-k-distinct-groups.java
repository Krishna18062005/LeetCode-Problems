class Solution {
    public boolean partitionArray(int[] nums, int k) {
        
        if(nums.length % k!=0) return false;

        int max =0;
        for(int i:nums) max = Math.max(max,i);
        int[] freq = new int[max+1];

        for(int i:nums){
            freq[i]++;
            if(freq[i] > nums.length/k) return false;
        }
        return true;
    }
}