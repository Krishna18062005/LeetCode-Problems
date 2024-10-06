class Solution {
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        int max=(int)Math.pow(2,n)-1;
        System.out.print(max);
        for(int i=0;i<=max;i++){
            if(adjaZero(bin(Integer.toBinaryString(i),n))){
                ans.add(bin(Integer.toBinaryString(i),n));
            }
        }
        return ans;
    }
    static String bin(String a,int n){
        
        String as="";
        int c=n-a.length();
        
        for(int i=0;i<c;i++){
            as+='0';
        }
        return as+a;
        
    }
    static boolean adjaZero(String st){
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)=='0'&&st.charAt(i+1)=='0') return false;
        }
        return true;
    }
}