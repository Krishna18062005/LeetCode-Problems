class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int ans[]=new int[friends.length];
        int ind=0;
        Set<Integer> set=new HashSet<>();
        for(int i:friends) set.add(i);
        for(int i:order){
            if(set.contains(i))
            ans[ind++]=i;
        }
        return ans;
    }
}