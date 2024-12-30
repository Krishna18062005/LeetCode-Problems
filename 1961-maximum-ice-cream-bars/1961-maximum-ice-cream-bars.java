class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int i:costs){
            if(i<=coins){
                c++;
                coins-=i;
            }
            else{
                break;
            }

        }
        return c;
    }
}