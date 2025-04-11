class Solution {
    public int countSymmetricIntegers(int low, int high) {
       int c=0;
       for(int i=low ;i<=high;i++){
        String st=i+"";
        int s=0;
        if(st.length()%2==0){
        for(int j=0;j<st.length()/2;j++){
            s+=(st.charAt(j));
            s-=st.charAt(st.length()-j-1);
        }
        if(s==0) c++;
        }
       }
return c;
    }
}