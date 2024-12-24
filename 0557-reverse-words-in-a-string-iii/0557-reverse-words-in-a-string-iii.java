class Solution {
    public String reverseWords(String s) {
       String ar[]=s.split(" ");
       StringBuilder ans=new StringBuilder();
       for(String i:ar){
        ans.append(new StringBuilder(i).reverse());
        ans.append(" ");
       } 
       return ans.toString().trim();
    }
}