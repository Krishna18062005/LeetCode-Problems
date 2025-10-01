class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int em=0;
        int ans=0;
        int br=numBottles;
        while(br>0){
           ans+=br;
           em+=br;
           br=em/numExchange;
           em%=numExchange;
            
        }
        return ans;
    }
}