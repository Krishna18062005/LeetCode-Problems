class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String num="";
            for(int i=0;i<s.length()-1;i++){
                int k=s.charAt(i)-'0'+s.charAt(i+1)-'0';
                num=num+""+(k%10);

            }
            s=num+"";
        }
        
        return s.charAt(0)==s.charAt(1);
     
    }
}