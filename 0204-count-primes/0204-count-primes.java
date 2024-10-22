class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int c=1;
        boolean []arr=new boolean[n];
        Arrays.fill(arr,true);
        for(int i=2;i*2<n;i++) arr[2*i]=false;
        for(int i=3;i<n;i+=2){
            if(arr[i]){
                c++;
                for(int j=1;j*i<n;j++){
                    arr[j*i]=false;
                }
            }
        }
        
        return c;
    }
    }