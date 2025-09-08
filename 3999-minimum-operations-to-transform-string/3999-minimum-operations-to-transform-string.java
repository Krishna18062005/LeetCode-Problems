class Solution {
    public int minOperations(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            //if(c!=0)
            ans=Math.max(ans,(26-c)%26);
        }
        return ans;
    }
}