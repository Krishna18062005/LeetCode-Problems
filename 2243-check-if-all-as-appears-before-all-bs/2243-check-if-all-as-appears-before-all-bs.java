class Solution {
    public boolean checkString(String s) {
        char prev='a';
        int c=0;
        for(int i=0;i<s.length();i++){
            if(prev!=s.charAt(i)){
                c++;
            }
            if(c>1){
                return false;
            }
            
            prev=s.charAt(i);
        }
        return true;
    }
}