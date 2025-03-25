class Solution {
    public boolean doesAliceWin(String s) {
        boolean v=false;
        for(char i:s.toCharArray()){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
                v=true;
                break;
            }
        }
        return v;
    }
}