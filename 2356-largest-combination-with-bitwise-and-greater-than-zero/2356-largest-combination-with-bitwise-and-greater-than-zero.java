class Solution {
    public int largestCombination(int[] candidates) {
        int[] arr=new int[25];
        int ans=0;
        for(int i:candidates){
            for(int j=0;j<25;j++){
                arr[j]+=(i&1);
                ans=Math.max(ans,arr[j]);
                i>>=1;
            }
        }
        return ans;
    }
}