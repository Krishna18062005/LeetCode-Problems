class Solution {
    public int smallestNumber(int n) {
        int ans=n;
        String bin=Integer.toBinaryString(ans);
        int bc=Integer.bitCount(ans);
        while(bin.length()!=bc){
            ans++;
            bin=Integer.toBinaryString(ans);
            bc=Integer.bitCount(ans);
        }
        return ans;
    }
}