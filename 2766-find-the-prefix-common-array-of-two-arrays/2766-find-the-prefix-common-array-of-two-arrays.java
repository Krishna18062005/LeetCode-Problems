class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq=new int[A.length+1];
        int []ans=new int[A.length];
          int c=0;
        for(int i=0;i<B.length;i++){
        
            if(++freq[B[i]]==2) c++;
            if(++freq[A[i]]==2) c++;
         
            ans[i]=c;
        }
        
        return ans;

    }
}