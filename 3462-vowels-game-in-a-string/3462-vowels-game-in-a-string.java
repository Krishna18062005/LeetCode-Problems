class Solution {
    public boolean doesAliceWin(String s) {
        boolean v=false;
        for(char i:s.toCharArray()){
            if("AEIOUaeiou".contains(i+"")){
                v=true;
                break;
            }
        }
        return v;
    }
}