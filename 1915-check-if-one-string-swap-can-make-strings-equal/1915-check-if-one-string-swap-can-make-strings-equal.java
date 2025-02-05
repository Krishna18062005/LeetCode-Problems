class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char[] s1A=s1.toCharArray();
        char[] s2A=s2.toCharArray();
        Arrays.sort(s1A);
        Arrays.sort(s2A);
        int c=0;
        if(Arrays.equals(s1A,s2A)){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)==s2.charAt(i)) c++;
            }

        }
        else
        return false;
        return c==s1.length()||c+2==s1.length();
        
    }}
