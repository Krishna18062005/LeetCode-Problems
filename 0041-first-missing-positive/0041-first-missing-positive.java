class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> a=new HashSet<>();
        int max=0;
        for(int i:nums) if(i>0){ a.add(i);max=Math.max(i,max);}
        for(int i=1;i<max;i++){
            if(!a.contains(i)) return i;
        } 
        return max+1;
    }
}