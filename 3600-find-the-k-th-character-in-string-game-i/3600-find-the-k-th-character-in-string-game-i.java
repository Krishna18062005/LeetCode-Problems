class Solution {
    public char kthCharacter(int k) {
        String ans="a";
        while(ans.length()<k){
            int n=ans.length();
            for(int i=0;i<n;i++){
                char ch=ans.charAt(i);
                if(ch=='z') ans+='a';
                else ans+=(char)(int)(ch+1);
            }

        }
        return ans.charAt(k-1);

    }
}