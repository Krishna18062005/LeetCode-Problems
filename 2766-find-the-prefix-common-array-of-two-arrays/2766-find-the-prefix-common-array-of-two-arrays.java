class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq=new int[A.length+1];
        int []ans=new int[A.length];
          int c=0;
        for(int i=0;i<B.length;i++){
            freq[B[i]]++;
            if(freq[B[i]]==2) c++;
            freq[A[i]]++;
            if(freq[A[i]]==2) c++;
         
            ans[i]=c;
        }
        
        return ans;

    }
}