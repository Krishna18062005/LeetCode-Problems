class Solution {
    public int myAtoi(String s) {
        long ans=0;
       
        if(s.length()<=0) return 0;
        
        
        int i=0;
        while(i<s.length()&&s.charAt(i)==' ') i++;
        if(i==s.length()) return 0;
        int m=1;
        if(s.charAt(i)=='-') { m=-1;i++;}
        else if(s.charAt(i)=='+') i++;
        for(;i<s.length();i++){
           char c=s.charAt(i);
            
            if(c<='9'&&c>='0'){
                ans=ans*10+(c-'0');
                if(m*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
                if(m*ans>Integer.MAX_VALUE) return Integer.MAX_VALUE; 

            }
            else{
                break;
            }
        }
        
        return (int)ans*m;
    }
}