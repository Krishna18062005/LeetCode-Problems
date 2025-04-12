class Solution {
    public int minOperations(int[] nums, int k) {
        int s=0;
        for(int i:nums){
            s+=i;
        }
        return s%k;
    }
}