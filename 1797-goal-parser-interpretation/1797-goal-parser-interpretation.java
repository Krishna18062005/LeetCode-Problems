class Solution {
    public String interpret(String c) {
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='('&&c.charAt((i+1)%c.length())==')') ans.append('o');
            else if(c.charAt(i)=='('||c.charAt(i)==')') continue;
            else ans.append(c.charAt(i));
        }
        return ans.toString();
    }
}