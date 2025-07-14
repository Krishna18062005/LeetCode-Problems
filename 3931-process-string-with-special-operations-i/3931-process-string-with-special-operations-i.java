class Solution {
    public String processStr(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<=122&&s.charAt(i)>=97)
                    ans.append(s.charAt(i));
            else        
            switch(s.charAt(i)){
                case '*':
                    if(ans.length()>0)
                    ans=new StringBuilder(ans.toString().substring(0,ans.length()-1));
                    break;
                case '#':
                    String as=ans.toString();
                    ans.append(as);
                    break;
                case '%':                   
                    ans.reverse();
                    break;
            }
        }
        return ans.toString();
        
    }
}