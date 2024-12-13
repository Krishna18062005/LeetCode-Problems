class Solution {
    public long findScore(int[] nums) {
      
        long score=0;      
        boolean visited[]=new boolean[nums.length];
        int[][] nu=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            nu[i][0]=nums[i];
            nu[i][1]=i;
        }
        Arrays.sort(nu,(a,b)->a[0]-b[0]);
        for(int i=0;i<nums.length;i++){
            if(!visited[nu[i][1]]){
                score+=nu[i][0];
                visited[nu[i][1]]=true;
            if(nu[i][1]>0){
                visited[nu[i][1]-1]=true;
            }
            if(nu[i][1]<nums.length-1)  visited[nu[i][1]+1]=true;
            }
            
        }
        
        return score;
    }
}