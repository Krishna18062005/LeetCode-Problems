class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        boolean[] vis1 = new boolean[n];
        boolean[] vis2 = new boolean[n];

        // Initialize distances to a large value
        final int INF = (int) 1e6;
        for (int i = 0; i < n; i++) {
            dist1[i] = INF;
            dist2[i] = INF;
        }

        // Traverse from node1
        for (int i = node1, len = 0; i != -1 && !vis1[i]; i = edges[i]) {
            dist1[i] = len++;
            vis1[i] = true;
        }

        // Traverse from node2
        for (int i = node2, len = 0; i != -1 && !vis2[i]; i = edges[i]) {
            dist2[i] = len++;
            vis2[i] = true;
        }

        int minDist = (int) 1e5;
        int result = -1;

        for (int i = 0; i < n; i++) {
            if (dist1[i] == INF || dist2[i] == INF) continue;
            int maxDist = Math.max(dist1[i], dist2[i]);

            if (maxDist < minDist) {
                minDist = maxDist;
                result = i;
            } else if (maxDist == minDist && i < result) {
                result = i;
            }
        }

        return result;
    }
}