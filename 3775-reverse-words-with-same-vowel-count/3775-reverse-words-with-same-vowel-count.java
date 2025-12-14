class Solution {
    public String reverseWords(String s) {
        String[] ip=s.split(" ");
        String f=ip[0];
        StringBuilder ans=new StringBuilder();
        int vc=Vowel(f);
        ans.append(f+" ");
        for(int i=1;i<ip.length;i++){
            if(vc==Vowel(ip[i])){
                ans.append(rev(ip[i])+" ");
            }else 
            ans.append(ip[i]+" ");

        }
        return ans.toString().trim();
    }
    static String rev(String s){
        String r=new StringBuilder(s).reverse().toString();
        return r;
        
    }
    static int Vowel(String i){
        int c=0;
        for(char ch:i.toCharArray()) if("AEIOUaeiou".indexOf(ch)!=-1) c++;
        return c;
    }
}