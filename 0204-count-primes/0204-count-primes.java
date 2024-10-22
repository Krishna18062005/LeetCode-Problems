class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean []arr=new boolean[n];
        Arrays.fill(arr,true);
        for(int i=2;i<n;i++){
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