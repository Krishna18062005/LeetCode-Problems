class Solution {
    public int largestCombination(int[] candidates) {
        int[] arr=new int[32];
        int ans=0;
        for(int k=0;k<candidates.length;k++){
            int i=candidates[k];
            for(int j=0;j<32;j++){
                
                arr[j]+=(i&1);
                ans=Math.max(ans,arr[j]);
                i>>=1;
            }
        }
        return ans;
    }
}