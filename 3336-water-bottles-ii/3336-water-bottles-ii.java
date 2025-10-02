class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int max=numBottles;
        int emp=max;
        
        while(numExchange<=emp){
        max++;
            
        emp=emp-(numExchange-1);
        numExchange++;
            
        }
        return max;
    }
}