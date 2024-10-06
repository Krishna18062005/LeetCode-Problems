class Solution {
    public String removeStars(String s) {
        Stack<Character> ans=new Stack<>();
        for(char i : s.toCharArray()){
            if(i=='*') ans.pop();
            else ans.push(i);
        }
        String an="";
        while(!ans.isEmpty()){
            an=ans.pop()+an;

        }
        return an;
    }
}