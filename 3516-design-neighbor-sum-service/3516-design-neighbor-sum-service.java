class NeighborSum {
    int[][] grid;
    int n;

    public NeighborSum(int[][] grid) {
        this.grid=grid;
        n=grid.length;
    }
    
    public int adjacentSum(int value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    int left = (j > 0) ? grid[i][j - 1] : 0;
                    int right = (j < grid[i].length - 1) ? grid[i][j + 1] : 0;
                    int up = (i > 0) ? grid[i - 1][j] : 0;
                    int bottom = (i < n - 1) ? grid[i + 1][j] : 0;
                    return left + right + up + bottom;
                }
            }
        }
        return -1;
    }
    
    public int diagonalSum(int value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    int sum =0;
                    if(i-1>=0 && j-1>=0) sum+=grid[i-1][j-1];
                    if(i+1<n && j+1<n) sum+=grid[i+1][j+1];
                    if(i+1<n && j-1>=0) sum+=grid[i+1][j-1];
                    if(i-1>=0 && j+1<n) sum+=grid[i-1][j+1];

                    return sum;
                }
            }
        }
        return -1;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */