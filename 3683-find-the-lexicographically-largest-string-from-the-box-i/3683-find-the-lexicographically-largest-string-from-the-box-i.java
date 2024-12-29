class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1) return word;
        int len=word.length()-numFriends+1;
        String ans="";
        int n=word.length();
        for(int i=0;i<n;i++){
            if(i+1>=numFriends){
                if(ans.compareTo(word.substring(i,n))<0) ans=word.substring(i,n);
                continue;
                
            } 
            if(ans.compareTo(word.substring(i,i+len))<0) ans=word.substring(i,i+len);}
        
        return ans;
    }
}