class Solution {
    public int largestPrime(int n) {
        
        int s=0;
        int ans=0;
        for(int i=2;i<=n;i++){
            if(isp(i)){
                s+=i;
                if(s>n) break;
                if(isp(s)) ans=s;
            }
        }
        return ans;
        
        
    }
    private boolean isp(int n ){
if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0) return false;
        }
        return true;
    }
}