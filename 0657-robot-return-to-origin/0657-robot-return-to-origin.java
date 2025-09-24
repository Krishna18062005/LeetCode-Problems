class Solution {
    public boolean judgeCircle(String moves) {
        int leftRight=0;
        int upDown=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U') upDown++;
            else if(ch=='D') upDown--;
            else if(ch=='L') leftRight++;
            else leftRight--;
        }
        return leftRight==0&&upDown==0;
    }
}