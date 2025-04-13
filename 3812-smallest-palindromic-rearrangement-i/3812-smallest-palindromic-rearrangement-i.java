class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int ind=0;
        StringBuilder st=new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]==0) continue;
            else{
                while(freq[i]>=2){
                    freq[i]-=2;
                    st.insert(st.length()-ind,(char)(i+'a'));
                    st.insert(ind,(char)(i+'a'));
                    ind++;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                continue;
            }
            else{
                st.insert(ind,(char)(i+'a'));
            }
        }
        return st.toString();
        
    }
}