class Solution {
    public long countSubstrings(String s, char c) {
        long n =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) n++;
        }
        return n*(n+1)/2;
    }
}