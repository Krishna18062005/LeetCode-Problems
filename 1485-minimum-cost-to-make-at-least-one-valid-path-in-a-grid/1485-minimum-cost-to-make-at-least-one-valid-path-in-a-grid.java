class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // right, left, down, up
        Deque<int[]> deque = new ArrayDeque<>();
        int[][] cost = new int[m][n];
        for (int[] row : cost) Arrays.fill(row, Integer.MAX_VALUE);
        
        deque.offer(new int[]{0, 0});
        cost[0][0] = 0;
        
        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int x = curr[0], y = curr[1];
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + directions[dir][0];
                int ny = y + directions[dir][1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    int newCost = cost[x][y] + (grid[x][y] == dir + 1 ? 0 : 1);
                    if (newCost < cost[nx][ny]) {
                        cost[nx][ny] = newCost;
                        if (grid[x][y] == dir + 1) {
                            deque.offerFirst(new int[]{nx, ny}); // 0-cost move
                        } else {
                            deque.offerLast(new int[]{nx, ny}); // 1-cost move
                        }
                    }
                }
            }
        }
        return cost[m - 1][n - 1];
    }
}