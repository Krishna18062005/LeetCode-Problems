class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n+1];
        for(int i=0; i<n+1; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k] = 0;
        int i=0;
        for(; i++<n-1; ) {
            for(int j=0; j<times.length; j++) {
                if(dist[times[j][0]]!=Integer.MAX_VALUE) {
                    dist[times[j][1]] = Math.min(dist[times[j][0]]+times[j][2], dist[times[j][1]]);
                }
            }
        }
        int max = 0;
        for(i=0; i+1<dist.length; i++) {
            max = Math.max(max,dist[i+1]);
        }
        
        return max==Integer.MAX_VALUE?-1:max;
    }
}