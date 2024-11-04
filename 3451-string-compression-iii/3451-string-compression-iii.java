class Solution {
    public String compressedString(String word) {
        StringBuilder ans=new StringBuilder("");
        char prev=word.charAt(0);
        int c=0;
        for(int i=0;i<word.length();i++){
            if(prev!=word.charAt(i)){
                ans.append(c+""+prev);
                c=1;
                prev=word.charAt(i);
            }
            else{
                
                if(c>8){
                    ans.append(c+""+prev);
                    c=0;
                    prev=word.charAt(i);
                }
                c++;
            }

        }
        if(c>0){
            ans.append(c+""+prev);

        }
        return ans.toString();

    }
}