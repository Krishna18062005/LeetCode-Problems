class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // int c=0;
        // if(brokenLetters.equals("")) return text.split(" ").length;
        // brokenLetters="["+brokenLetters+"]";
        // for(String i:text.split(" ")){
        //     String l=i.replaceAll(brokenLetters,"");
        //     if(i.length()==l.length()) c++;
        // }
        // return c;

        String[] str = text.split(" ");
        int ans = str.length;
        for(String s : str){
            for(int i=0;i<brokenLetters.length();i++){
                if(s.indexOf(brokenLetters.charAt(i))!=-1){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}