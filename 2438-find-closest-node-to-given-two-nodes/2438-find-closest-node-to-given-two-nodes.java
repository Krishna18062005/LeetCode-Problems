class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
       int n = edges.length;
        int[] d1 = new int[n];
        Arrays.fill(d1, -1);
        int[] d2 = new int[n];
        Arrays.fill(d2, -1);
        int d=0;
        while (node1 != -1 && d1[node1] == -1) {
            d1[node1] = d++;
            node1 = edges[node1];
        }
        d=0;
        while (node2 != -1 && d2[node2] == -1) {
            d2[node2] = d++;
            node2 = edges[node2];
        }
        int dist = Integer.MAX_VALUE;
        int index = -1;
        for (int i=0; i<n; i++) {
            if (d1[i] != -1 && d2[i] != -1) {
                d = Math.max(d1[i], d2[i]);
                if (d < dist) {
                    dist = d;
                    index = i;
                }
            }
        }
        return index;
    }
}