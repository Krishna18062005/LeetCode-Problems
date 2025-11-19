class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        int n=original;
        while(set.contains(n)){
            n*=2;
        }
        return n;
    }
}