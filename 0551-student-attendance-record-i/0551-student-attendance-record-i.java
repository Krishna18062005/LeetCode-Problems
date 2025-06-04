class Solution {
    public boolean checkRecord(String s) {
        int t=0;
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') {t=0;a++;}
            else if(s.charAt(i)=='L'){t++;if(t==3) return false;}
            else{
                t=0;
            }
        }
        return a<2;
    }
}