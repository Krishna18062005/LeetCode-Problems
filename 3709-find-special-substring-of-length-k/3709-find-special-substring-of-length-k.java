class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
       
        for(int i=0;i<=s.length()-k;i++){
            if(i==-1||i==0||s.charAt(i-1)!=s.charAt(i)){
            char fs=s.charAt(i);
            int j=i;
            for(j=i;j<i+k;j++){
                if(fs!=s.charAt(j)){
                    break;
                }
            }
            
            if(j==i+k&&(i+k>=s.length()||s.charAt(i+k)!=s.charAt(i+k-1))){
                return true;
            }}
        }
        return false;
    }
}