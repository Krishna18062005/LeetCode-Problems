class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
        int c=0;
        for(int i:nums){
            if(i<k){
                pq.offer(i);
            }
        }
        while(pq.size()>1){
            c++;
            int f=pq.poll();
            int s=pq.poll();
            long num=(long)Math.min(f,s)*2+Math.max(f,s);
            if(num<(long)k){
                pq.offer((int)num);
            }

        }
        System.out.print(pq);
        return c+pq.size();
    }
}