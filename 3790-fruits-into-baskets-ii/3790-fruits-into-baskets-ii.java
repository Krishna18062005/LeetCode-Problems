class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans=0;
        boolean vis[] =new boolean[baskets.length];
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(!vis[j]&&fruits[i]<=baskets[j]){
                    vis[j]=true;
                    baskets[j]-=fruits[i];
                    fruits[i]=0;
                    break;
                }
            }
        }
        for(int i:fruits){
            if(i!=0) ans++;

        }
        return ans;
    }
}