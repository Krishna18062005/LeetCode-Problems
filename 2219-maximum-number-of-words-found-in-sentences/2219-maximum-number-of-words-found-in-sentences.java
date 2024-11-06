class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(String s:sentences){
            ans=Math.max(s.split(" ").length,ans);
        }
        return ans;
    }
}