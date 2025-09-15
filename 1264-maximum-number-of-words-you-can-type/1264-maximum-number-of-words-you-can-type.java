class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c=0;
        if(brokenLetters.equals("")) return text.split(" ").length;
        brokenLetters="["+brokenLetters+"]";
        for(String i:text.split(" ")){
            String l=i.replaceAll(brokenLetters,"");
            if(i.length()==l.length()) c++;
        }
        return c;
    }
}