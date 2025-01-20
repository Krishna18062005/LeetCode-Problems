class Solution {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int numRows = mat.length;
        int numCols = mat[0].length;
        int[] rowCount = new int[numRows];
        int[] colCount = new int[numCols];
        Map<Integer, int[]> numToPos = new HashMap<>();

        // Create a map to store the position of each number in the matrix
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int value = mat[row][col];
                numToPos.put(value, new int[] { row, col });
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int[] pos = numToPos.get(num);
            int row = pos[0];
            int col = pos[1];

            // Increment the count for the corresponding row and column
            rowCount[row]++;
            colCount[col]++;

            // Check if the row or column is completely painted
            if (rowCount[row] == numCols || colCount[col] == numRows) {
                return i;
            }
        }

        return -1; // This line will never be reached as per the problem statement
    }
}