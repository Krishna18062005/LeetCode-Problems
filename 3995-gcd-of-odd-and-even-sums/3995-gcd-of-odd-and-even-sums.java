class Solution {
    public int gcdOfOddEvenSums(int n) {
        return gcd(n*(n+1),n*(n));

    }
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}