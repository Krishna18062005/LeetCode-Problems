class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int p = 0;
        for (int r = 0; r < n; r++) {
            for (int c = r; c < n - r; c++)
                ans[r][c] = ++p;
            for (int c = r + 1; c < n - r - 1; c++)
                ans[c][n - r - 1] = ++p;
            for (int c = n - r - 1; c > r; c--)
                ans[n - r - 1][c] = ++p;
            for (int c = n - r - 1; c > r; c--)
                ans[c][r] = ++p;
        }
        return ans;
    }
}