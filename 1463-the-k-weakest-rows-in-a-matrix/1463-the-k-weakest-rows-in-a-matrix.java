class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] row=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1) c++;
            }
            row[i][0]=c;
            row[i][1]=i;
        }
        Arrays.sort(row,(a,b)->a[0]-b[0]);
        int ans[]=new int[k];
        int i=0;
        while(i<k){
            ans[i]=row[i][1];
            i++;
        }
        return ans;
    }
}