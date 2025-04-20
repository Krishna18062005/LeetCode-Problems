class Solution {
    public long calculateScore(String[] instructions, int[] values) {
          long score = 0;
        int i=0;
        int[] vis = new int[values.length];
        while(i<values.length && i>=0){
            if(vis[i]==1) break;
            vis[i]=1;
            if(instructions[i].equals("add"))
            {
                score +=values[i];
                i=i+1;
            }
            else{
                i=i+values[i];
            }
        }
        return score;
    }
}