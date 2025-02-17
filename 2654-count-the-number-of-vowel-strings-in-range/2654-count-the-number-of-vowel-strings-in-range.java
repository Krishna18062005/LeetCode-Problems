class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            if(isStarts(words[i])) c++;
        }
        return c;
    }
    public static boolean isStarts(String s){
        char f=s.charAt(0);
        char l=s.charAt(s.length()-1);
        return (isvowel(f)&&isvowel(l));
    }
    public static boolean isvowel(char v){
        switch(v){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
        }
        return false;
    }
}