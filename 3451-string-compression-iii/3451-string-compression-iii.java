class Solution {
    public String compressedString(String word) {
        StringBuilder ans=new StringBuilder("");
        char prev=word.charAt(0);
        int c=0;
        for(int i=0;i<word.length();i++){
            if(prev!=word.charAt(i)){
                ans.append(c);
                ans.append(prev);
                c=1;
            }
            else{
                 c++;
                if(c>9){
                    ans.append('9');
                    ans.append(prev);
                    c=1;
                }              
            }
            prev=word.charAt(i);

        }
        if(c>0){
            ans.append(c);
            ans.append(prev);

        }
        return ans.toString();

    }
}