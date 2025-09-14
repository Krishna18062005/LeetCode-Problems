class Solution {
    public int earliestTime(int[][] tasks) {
        int ans=200;
        for(int[] i:tasks) ans=Math.min(ans,i[0]+i[1]);
        return ans;
    }
}