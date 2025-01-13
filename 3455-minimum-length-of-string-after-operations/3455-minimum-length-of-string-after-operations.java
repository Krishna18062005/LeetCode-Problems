class Solution {
    public int minimumLength(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            while(freq[i]>2){
                c+=2;
                freq[i]-=2;
            }
        }
        return s.length()-c;
    }
}