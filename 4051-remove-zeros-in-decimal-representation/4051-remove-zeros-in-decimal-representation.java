class Solution {
    public long removeZeros(long n) {
        String nu=n+"";
        nu=nu.replaceAll("0","");
        return (long)Long.valueOf(nu);
    }
}