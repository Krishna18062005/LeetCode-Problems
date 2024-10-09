class Solution {
    public int valueAfterKSeconds(int n, int k) {
        long []arr=new long[n];
        Arrays.fill(arr,1);
        int c=0;
        int mod=1000000007;
        while(c<k){
            c++;
            for(int i=1;i<n;i++){
                arr[i]+=(arr[i-1]);
                arr[i]%=mod;
            }

        }
        return (int)arr[n-1]%mod;
    }
}