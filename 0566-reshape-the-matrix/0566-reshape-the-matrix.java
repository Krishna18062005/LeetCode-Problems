class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c) return mat;
        int[] ans[]=new int[r][c];
        int row=mat.length;
        int col=mat[0].length;
        int ri=0;
        int ci=-1;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int num=0;
                if(ci+1<col){                   
                    num=mat[ri][++ci];
                }
                else{
                    ci=0;
                    num=mat[++ri][ci];
                }
                ans[i][j]=num;
             
            }
        }
        return ans;
    }
}