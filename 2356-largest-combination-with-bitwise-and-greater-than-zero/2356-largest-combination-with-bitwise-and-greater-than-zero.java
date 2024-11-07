class Solution {
    public int largestCombination(int[] candidates) {
        int[] arr=new int[32];
        int ans=0;
        for(int i:candidates){
            for(int j=0;j<32;j++){
                arr[j]+=(i&1);
                if(ans<arr[j]) ans=arr[j];
                i>>=1;
            }
        }
        return ans;
    }
}