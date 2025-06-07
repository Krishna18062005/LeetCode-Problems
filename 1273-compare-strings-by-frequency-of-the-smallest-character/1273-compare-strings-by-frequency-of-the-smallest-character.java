class Solution {
    public static int f(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i:freq){
            if(i>0) return i;
        }
        return -1;
    }
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans=new int[queries.length];
        for(int i=0;i<ans.length;i++){
            int c=0;
            int count=f(queries[i]);
            for(String w:words){
                if(count<f(w)){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}