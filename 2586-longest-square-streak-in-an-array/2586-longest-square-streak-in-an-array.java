class Solution {
    public int longestSquareStreak(int[] nums) {
        
        Set<Long> set=new HashSet<>();
        for(int i:nums) set.add((long)i);
        int max=-1;
        for(int i:nums){
            int c=0;
            long l=(long)i;
            while(set.contains(l)){
                c++;
                l=l*l;
            }
            if(c>1)
            max=Math.max(c,max);
        }
        return max;
    }
}