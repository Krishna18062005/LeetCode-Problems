class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans=new ArrayList<>();
        boolean skip=false;
        for(int i=0;i<grid.length;i++){
            if(i%2==0)
            for(int j=0;j<grid[0].length;j++){
                if(!skip){
                    ans.add(grid[i][j]);
                    skip=!skip;
                }
                else{
                    skip=!skip;
                }
            }
            else
            for(int j=grid[0].length-1;j>=0;j--){
               if(!skip){
                    ans.add(grid[i][j]);
                   skip=!skip;
                }
                else{
                    skip=!skip;
                } 
            }
        }
        return ans;
    }
}