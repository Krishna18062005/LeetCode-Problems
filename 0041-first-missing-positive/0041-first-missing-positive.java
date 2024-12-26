class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums) if(i>0) a.add(i);
        for(int i=1;i<=a.size();i++){
            if(!a.contains(i)) return i;
        } 
        return a.size()+1;
    }
}