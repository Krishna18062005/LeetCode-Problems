class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans=0;
        StringBuilder st=new StringBuilder(word);
        while(sequence.contains(st.toString())){
            st.append(word);
            ans++;
        }
        return ans;
    }
}