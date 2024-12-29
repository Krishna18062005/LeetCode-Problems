class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1) return word;
        int len=word.length()-numFriends+1;
        String ans="";
        int maxInd=0;
        char ch=word.charAt(0);
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(ch<word.charAt(i)) {
                ch=word.charAt(i);
                maxInd=i;
            }
        }
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)) ls.add(word.length()-i);
        }
        ls.add(len);
        
        for(int le:ls){
            if(le>len){continue;}
        for(int i=0;i+le<=word.length();i++){
            if(ans.compareTo(word.substring(i,i+le))<0) ans=word.substring(i,i+le);
        }}
        return ans;
    }
}