class Solution {
    public boolean checkRecord(String s) {
        int t=0;
        int a=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A') {t=0;a++;}
            else if(ch=='L'){t++;if(t==3) return false;}
            else{
                t=0;
            }
        }
        return a<2;
    }
}