class Solution {
    public String clearDigits(String s) {
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='0'&&s.charAt(i)<='9')){
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}