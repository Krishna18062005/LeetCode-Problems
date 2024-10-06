class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i:piles){
            max=Math.max(i,max);
        }
        int ans=max;
       
        int l=1;
        int r=max;
        while(l<r)
        {
            int j=(l+r)/2;
            int hs=0;
            for(int i:piles){
                hs+=(int)Math.ceil((double)i/j);
            }
            if(hs<=h){
                r=j;
            }
            else {
                l=j+1;
            }

           
        }
        return l;
        
    }
}