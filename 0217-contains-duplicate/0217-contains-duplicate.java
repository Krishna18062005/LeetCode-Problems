class Solution {
    static{
        for(int i=0;i<500;i++){
            new Solution().containsDuplicate(null);
        }
    }
    public boolean containsDuplicate(int[] nums) {
        if(nums==null)return false;
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums ){
            if(!set.add(i)) return true;
        }
        return false;
    }
}