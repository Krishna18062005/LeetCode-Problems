class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       if (mat == null || mat.length == 0)
            return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int i = 0, row = 0, col = 0;

        while (i < m * n) {
            // Go up-right when sum of indices is even
            if ((row + col) % 2 == 0) {
                while (row >= 0 && col < n) {
                    result[i++] = mat[row][col];
                    row--;
                    col++;
                }
                // Move to next valid position
                if (col == n) { // hit right border
                    row += 2;
                    col--;
                } else {
                    row++;
                }
            } 
            // Go down-left when sum of indices is odd
            else {
                while (col >= 0 && row < m) {
                    result[i++] = mat[row][col];
                    row++;
                    col--;
                }
                // Move to next valid position
                if (row == m) { // hit bottom border
                    col += 2;
                    row--;
                } else {
                    col++;
                }
            }
        }

        return result;
    }
}