class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int ans[]=new int[friends.length];
        int ind=0;
        int[] set=new int[101];
        for(int i:friends) set[i]++;
        for(int i:order){
            if(set[i]!=0)
            ans[ind++]=i;
        }
        return ans;
    }
}