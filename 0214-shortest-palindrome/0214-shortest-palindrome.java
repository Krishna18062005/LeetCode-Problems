class Solution {
    public String shortestPalindrome(String s) {
        String re=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length();i++){
           
            if(s.substring(0,s.length()-i).equals(re.substring(i))) {
                String a=new StringBuilder(re.substring(0,i)).reverse().toString();
                return re.substring(0,i)+re.substring(i)+a;
            }
        }
        return "";
    }
}