class Solution {
    public String truncateSentence(String s, int k) {
        int c=0;
        String ans="";
        for(String i:s.split(" ")){
            if(c++==k) break;
            ans+=i+" "; 
        }
        return ans.trim();
    }
}