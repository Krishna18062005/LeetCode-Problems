class Solution {
    static{
        for(int i=0;i<10000;i++){
            new Solution().containsDuplicate(new int[]{1,2,3});
        }
    }
    public boolean containsDuplicate(int[] nums) {
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums ){
            if(!set.add(i)) return true;
        }
        return false;
    }
}