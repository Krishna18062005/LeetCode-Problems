class Solution {
    public int findKthPositive(int[] arr, int k) {
      int c=0;
      int fr[]=new int[2001];
      for(int i:arr){
        fr[i]++;
      }
      for(int i=1;i<2001;i++){
        if(fr[i]==0){
            c++;
        }
        if(c==k) return i;
      }
      return -1;
    }
}