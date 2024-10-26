class Solution {
    public int possibleStringCount(String word) {
        int c=0;
        char prev=word.charAt(0);
        for(int i=0;i<word.length();i++){
            if(prev==word.charAt(i)) c++;
            prev=word.charAt(i);
        }
        return c;
    }
}