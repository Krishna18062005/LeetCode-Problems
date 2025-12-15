class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans=new StringBuilder("");
        char prev=' ';
        int c=0;
        for(char i :s.toCharArray()){
            if(prev==i){
                c++;
                if(c<2){
                    ans.append(i);
                }
            }
            else{
                c=0;
                ans.append(i);
            }
            prev=i;
        }
        return ans.toString();
    }
}