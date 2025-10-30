class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
       
       String ans="";
       if((l>=10000||w>=10000||h>=10000||(long)l*h*w>=1000000000)&&m>=100){
           ans="Both";
       }
       else if((l>=10000||w>=10000||h>=10000||(long)l*h*w>=1000000000)){
           ans="Bulky";
       }
       else if(m>=100){
        ans="Heavy";
       }
       else{
        ans="Neither";
       }

       return ans;
    }
}