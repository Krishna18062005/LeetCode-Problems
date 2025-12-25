class Solution {
    public int distributeCandies(int[] c) {
        Set<Integer> set=new HashSet<>();
        for(int i:c){
            set.add(i);
        }
        int n=c.length;
        int max=n/2;
        if(max>=set.size()) return set.size();
        return max;
    }
}