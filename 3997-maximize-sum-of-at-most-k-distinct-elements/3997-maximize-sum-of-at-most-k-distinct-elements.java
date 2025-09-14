class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int[] ans=new int[Math.min(k,set.size())];
        for(int i:set) pq.offer(i);
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.poll();
        }
        return ans;


    }
}