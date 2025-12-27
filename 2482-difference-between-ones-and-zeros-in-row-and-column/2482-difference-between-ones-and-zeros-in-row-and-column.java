class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rowOnes = new int[m];
        int[] colOnes = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowOnes[i]++;
                    colOnes[j]++;
                }
            }
        }

        int[][] diff = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int onesRow = rowOnes[i];
                int onesCol = colOnes[j];
                int zerosRow = n - onesRow;
                int zerosCol = m - onesCol;

                diff[i][j] = onesRow + onesCol - zerosRow - zerosCol;
            }
        }

        return diff;
    }
}