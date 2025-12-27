class Solution {
    public String replaceDigits(String s) {
        String res="";
        char ar[]=s.toCharArray();
         int i=0;
        for(i=1;i<ar.length;i+=2){
            res+=(ar[i-1]);
            res+=(char)(((int)ar[i-1])+ar[i]-'0');
        }
        if(i==ar.length) res+=ar[i-1];
        return res;
    }
}