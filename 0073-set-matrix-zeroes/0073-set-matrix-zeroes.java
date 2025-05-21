class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] row=new boolean[matrix.length];
        boolean[] col=new boolean[matrix[0].length];

        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}