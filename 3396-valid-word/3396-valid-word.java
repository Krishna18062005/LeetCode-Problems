class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean v,c;
        v=c=false;
        int co=0;
        String vow="AEIOUaeiou";
        for(char i:word.toCharArray()){
            if(vow.contains(i+"")) {v=true;co++;}
            else if((i<='z'&&i>='a')||(i<='Z'&&i>='A')) {c=true;co++;}
            if(i<='9'&&i>='0') {co++;}

        }
        return v&&c&&co==word.length();
    }
}