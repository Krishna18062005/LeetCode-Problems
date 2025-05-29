class Solution {
    public String convertToBase7(int num) {
        String ans="";
        if(num==0) return "0";
        if(num<0){ ans="-";num=-num;}
        StringBuilder st=new StringBuilder();
        while(num>0){
            st.append(num%7);
            num/=7;
        }
        return ans+st.reverse().toString();


    }
}