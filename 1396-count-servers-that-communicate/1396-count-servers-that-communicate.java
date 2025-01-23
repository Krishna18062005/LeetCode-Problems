class Solution {

    public int countServers(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int[] rowCounts = new int[grid[0].length];
        int[] colCounts = new int[grid.length];

        
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    rowCounts[col]++;
                    colCounts[row]++;
                }
            }
        }

        int communicableServersCount = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    if (rowCounts[col] > 1 || colCounts[row] > 1) {
                        communicableServersCount++;
                    }
                }
            }
        }

        return communicableServersCount;
    }
}