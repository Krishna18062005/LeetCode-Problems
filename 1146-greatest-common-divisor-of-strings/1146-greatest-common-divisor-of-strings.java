class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String ans="";
        int min=Math.min(str1.length(),str2.length());
        String a,b; 
        if(min==str1.length()){
            a=str1;
            b=str2;
        }
        else{
            a=str2;
            b=str1;
        }
        int c=0;
        for(int i=0;i<min;i++){
            if(a.charAt(i)==b.charAt(i)){
                c++;
            }
            else{
                break;
            }
        }
        
        for(int i=c;i>=1;i--){

            String st=a.substring(0,i);
            String stt="";
            boolean aa=false;
            for(int j=1;j<=b.length()/i;j++){
                stt+=st;
                if(a.equals(stt)){
                    aa=true;

                }
                if(aa&&stt.equals(b)){
                   if(str1.length()%st.length()==0&&str2.length()%st.length()==0)
                    return st;
                }
            }

        }
        return "";
    }
}