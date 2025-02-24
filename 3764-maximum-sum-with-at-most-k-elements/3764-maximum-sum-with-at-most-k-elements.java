class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        long ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        
        for(int i=0;i<grid.length;i++){
            int t=limits[i];
            PriorityQueue<Integer> curr=new PriorityQueue<>((a,b)->b-a);
            for(int j=0;j<grid[i].length;j++){
                curr.offer(grid[i][j]);
            }
            while(t-->0){
                pq.offer(curr.poll());
            }            
        }
        
        
        while(k-->0){
            ans+=pq.poll();
        }
        return ans;


    }
}