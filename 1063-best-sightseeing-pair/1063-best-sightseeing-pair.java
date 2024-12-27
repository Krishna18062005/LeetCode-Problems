class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<values.length;i++){
            max=Math.max(max,ans+values[i]-i);
            ans=Math.max(ans,values[i]+i);
        }
        return max;

    }
}