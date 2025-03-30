class Solution {
    public int[] minCosts(int[] cost) {
        int min = 101;
        int[] arr = new int[cost.length];

        for(int i=0;i<cost.length;i++){
            min = Math.min(cost[i],min);
            arr[i] = min;
        }
        return arr;
        
    }
}