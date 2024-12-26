class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums) if(i>0) a.add(i);
        int n=a.size();
        for(int i=1;i<=n;i++){
            if(!a.contains(i)) return i;
        } 
        return n+1;
    }
}