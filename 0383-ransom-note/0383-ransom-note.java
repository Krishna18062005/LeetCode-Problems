class Solution {
    public boolean canConstruct(String r, String ma) {
        int[] freq=new int[26];
        for(char i:r.toCharArray()){
            freq[i-'a']++;
        }
        for(char i:ma.toCharArray()){
            freq[i-'a']--;
        }
        for(char i:r.toCharArray()){
            if(freq[i-'a']>0) return false;
        }
        return true;

    }
}