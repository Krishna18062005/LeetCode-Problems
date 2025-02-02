class Solution {
    public int maxDifference(String s) {
        
        int[] fr=new int[26];
        for(int i=0;i<s.length();i++){
            fr[s.charAt(i)-'a']++;
        }
        
        int ans=Integer.MIN_VALUE;
        for(int i:fr){
            if(i%2==0||i==0) continue;
            for(int j:fr){
                if(j%2!=0||j==0) continue;
                ans=Math.max(ans,i-j);
            }
        }
        return ans;
    }
}