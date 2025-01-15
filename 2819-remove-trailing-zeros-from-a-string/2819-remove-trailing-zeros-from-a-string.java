class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length()-1;
        while(num.charAt(n)=='0'){
            --n;
        }
        return num.substring(0,n+1);
    }
}