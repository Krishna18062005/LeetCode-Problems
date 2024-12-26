class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums) a.add(i);
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(i)) return i;
        } 
        return nums.length+1;
    }
}