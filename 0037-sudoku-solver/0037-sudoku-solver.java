class Solution {

    public boolean isSafe(char[][] board, int row, int col, char dig) {
        // check row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == dig) return false;
            if (board[i][col] == dig) return false;
        }

        // check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == dig) return false;
            }
        }

        return true;
    }

    public boolean solve(char[][] board, int row, int col) {
        if (row == 9) return true;  // solved all rows
        if (col == 9) return solve(board, row + 1, 0); // move to next row
        if (board[row][col] != '.') return solve(board, row, col + 1); // skip filled cells

        for (char d = '1'; d <= '9'; d++) {
            if (isSafe(board, row, col, d)) {
                board[row][col] = d;
                if (solve(board, row, col + 1)) return true;
                board[row][col] = '.'; // backtrack
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}
