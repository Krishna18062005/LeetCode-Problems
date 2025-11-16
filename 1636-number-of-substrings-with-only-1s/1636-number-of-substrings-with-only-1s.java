class Solution {
    public int numSub(String s) {
        long ans=0;
        long MOD=(1000000007);
        long c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') c++;
            else{
                ans+=((long)(c*(c+1))/2);
                c=0;
            }
        } 
        if(c!=0){
             ans+=((long)(c*(c+1))/2);
        }
        return (int)(ans%MOD);
        
        
       }
}