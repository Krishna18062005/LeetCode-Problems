class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:happiness) pq.offer(i);
        long ans=0;
        
        for(int i=0;i<k;i++){
            int kk=pq.poll()-i;if(kk<0){
                break;
            }
            ans+=(kk);
            
        }
        return ans;
    }
}