class Solution {
    public boolean containsDuplicate(int[] nums) {
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums ){
            if(!set.add(i)) return true;
        }
        return false;
    }
}