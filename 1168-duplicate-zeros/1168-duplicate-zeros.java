class Solution {
    public void duplicateZeros(int[] ar) {
        int[] arr=ar.clone();
        int n=arr.length;
        int j=0;
        for(int i:arr){
            ar[j]=i;
            if(i==0&&j+1<n) ar[++j]=0;
            ++j; 
            if(j==n) break;
        }
       
    }
}