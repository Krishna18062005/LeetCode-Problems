class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        long a = 1;
        for(int i: nums){
            if(i>target) return false;
            a *= i;
        }
        return a==target*target;
    }
}