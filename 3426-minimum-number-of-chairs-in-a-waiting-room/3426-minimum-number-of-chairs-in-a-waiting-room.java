class Solution {
    public int minimumChairs(String s) {
        int m=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                c++;
                m=Math.max(m,c);
            }
            else{
                c-=1;
            }
        }
        return m;
        
    }
}