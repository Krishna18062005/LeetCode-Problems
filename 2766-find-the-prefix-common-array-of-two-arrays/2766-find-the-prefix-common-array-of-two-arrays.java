class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq=new int[A.length+1];
        int []ans=new int[A.length];
        for(int i=0;i<B.length;i++){
            freq[B[i]]++;
            freq[A[i]]++;
            int c=0;
            for(int ii:freq){
                if(ii==2) c++;
            }
           ans[i]=c;
        }
        Arrays.sort(ans);
        return ans;

    }
}