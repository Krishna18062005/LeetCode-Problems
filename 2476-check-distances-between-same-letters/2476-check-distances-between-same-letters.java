class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int len = s.length();
        for(int i=0;i<len;i++){
            int d = distance[s.charAt(i)-'a'];
            if(i+d+1 >= len || s.charAt(i) != s.charAt(i+d+1)){
              return false;
            }
            distance[s.charAt(i)-'a']=-1; 
        }           
        return true;
    }
}