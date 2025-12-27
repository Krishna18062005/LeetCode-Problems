class Solution {
    public String replaceDigits(String s) {
        
        char ar[]=s.toCharArray();
         int i=0;
        for(i=1;i<ar.length;i+=2){
            
            ar[i]=(char)(((int)ar[i-1])+ar[i]-'0');
        }
        
        return new String(ar);
    }
}