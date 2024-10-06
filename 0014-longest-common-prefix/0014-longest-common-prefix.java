class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        
        String a=strs[0];
        for(int i=0;i<a.length();i++){
            for(String str:strs){
                if(i==str.length()) return s;
                if(str.charAt(i)!=a.charAt(i))
                    return s;
            }
            s=s+a.charAt(i);
        }
        return s;
    }
}