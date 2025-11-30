class Solution {
    public int maxDistinct(String s) {
        int c=0;
        int[] fr=new int[26];
        for(int i=0;i<s.length();i++){
            fr[s.charAt(i)-'a']++;
            if(fr[s.charAt(i)-'a']==1) c++;
        }
        return c;
    }
}