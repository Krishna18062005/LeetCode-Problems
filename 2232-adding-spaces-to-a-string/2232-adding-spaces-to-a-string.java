class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans=new StringBuilder();
        int p=0;
        for(int i=0;i<s.length();i++){
            if(p<spaces.length&&spaces[p]==i){
                ans.append(" ");
                p++;
            }
            ans.append(s.charAt(i));

        }
        return ans.toString();
    }
}