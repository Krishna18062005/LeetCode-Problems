class Solution {
    public boolean detectCapitalUse(String word) {
        
        boolean first=(word.charAt(0)-'A'<26);
        int c=0;

        for(int i=1;i<word.length();i++){
           if(word.charAt(i)<='Z'&&word.charAt(i)>='A') c++;
        }
        return c==0||first&&c==0||first && c==word.length()-1;
    }
}