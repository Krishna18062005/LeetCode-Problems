class Solution {
    public long pickGifts(int[] gifts, int k) {
        // for(int i=0;i<k;i++){
        //     int maxi=0;
        //     int max=gifts[0];
        //     for(int j=1;j<gifts.length;j++){
        //         if(max<gifts[j]){
        //             maxi=j;
        //             max=gifts[j];
        //         }
        //     }
        //     gifts[maxi]=(int)Math.sqrt(gifts[maxi]);
        // }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:gifts) pq.offer(i);
        while(k-->0) pq.add((int)Math.sqrt(pq.poll()));
        long s=0;
        while(!pq.isEmpty()) s+=(long)pq.poll();
        return s;
          }
}