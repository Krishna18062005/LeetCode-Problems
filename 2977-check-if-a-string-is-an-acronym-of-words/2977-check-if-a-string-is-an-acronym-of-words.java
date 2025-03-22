class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size()) return false;
        for(int i=0;i<s.length();i++){
            if(words.get(i).charAt(0)!=s.charAt(i)) return false;
        }
        return true;
    }
}