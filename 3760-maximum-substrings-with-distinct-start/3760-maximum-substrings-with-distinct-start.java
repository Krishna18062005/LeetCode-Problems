class Solution {
    public int maxDistinct(String s) {
        int c=0;
        boolean[] fr=new boolean[26];
        for(int i=0;i<s.length();i++){
            fr[s.charAt(i)-'a']=true;
            
        }
        for(var i:fr) if(i) c++;
        return c;
    }
}