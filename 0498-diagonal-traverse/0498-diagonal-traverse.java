class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[m * n];
        int i = 0, j = 0, flag = 0;
        for (int k = 0; k < m * n; k++) {
            arr[k] = mat[i][j];
            if (flag == 0) {
                i--;
                j++;
                if (j > n - 1) {
                    j = n - 1;
                    i += 2;
                    flag = 1;
                } else if (i < 0) {
                    i = 0;
                    flag = 1;
                }
            } else {
                i++;
                j--;
                if (i > m - 1) {
                    i = m - 1;
                    j += 2;
                    flag = 0;
                } else if (j < 0) {
                    j = 0;
                    flag = 0;
                }

            }
        }
        return arr;
    }
}