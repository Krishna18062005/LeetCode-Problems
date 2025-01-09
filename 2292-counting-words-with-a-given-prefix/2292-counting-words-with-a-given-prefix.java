class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String i:words) if(i.startsWith(pref)) c++;
        return c;
    }
}