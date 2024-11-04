class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c) return mat;
        int[] ans[]=new int[r][c];
        ArrayList<Integer> me=new ArrayList<>();
        for(int[] i:mat){
            for(int j:i){
                me.add(j);
            }
        }
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=me.get(k++);
            }
        }
        return ans;
    }
}