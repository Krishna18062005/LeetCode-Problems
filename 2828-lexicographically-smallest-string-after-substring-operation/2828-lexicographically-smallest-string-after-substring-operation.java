class Solution {
    public String smallestString(String s) {
        StringBuilder ans=new StringBuilder("");
        boolean cc=true;
        int i=0;
        int n=s.length();
        while(i<n&&s.charAt(i)=='a') i++;
        if(i==n) return s.substring(0,n-1)+'z';
        else{
            ans.append(s.substring(0,i));
        }
        for(;i<n;i++){
            char c=s.charAt(i);
            if(cc){
                if(c!='a'){
                   ans.append((char)(c-1));
                }
                else{
                    ans.append(c);
                    cc=false;
                }
            }
            else
            ans.append(c);
        }
        return ans.toString();
    
    }
}