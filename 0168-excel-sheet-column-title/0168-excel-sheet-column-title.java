class Solution {
    public String convertToTitle(int c) {
       StringBuilder ans=new StringBuilder("");
       
       while(c>=1){
        c--;
        int d=c%26;
        ans.append((char)((d+'A')));
        c/=26;
        
       }
       return ans.reverse().toString();
    }
}