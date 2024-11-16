class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i+k<=blocks.length();i++){
            ans=Math.min(ans,helper(blocks.substring(i,i+k)));
        }
        return ans;
    }
    int helper(String b){
        int c=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='W') c++;
        }
        return c;
    }
}