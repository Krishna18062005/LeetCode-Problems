class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            if(isPrime(Integer.bitCount(i))) c++;
        }
        return c;
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=4;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}