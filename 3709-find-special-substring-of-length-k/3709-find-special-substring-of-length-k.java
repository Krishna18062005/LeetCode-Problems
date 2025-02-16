class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
       
        for(int i=0;i<=s.length()-k;i++){
            if(i==-1||i==0||s.charAt(i-1)!=s.charAt(i)){
            Set<Character> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(s.charAt(j));
            }
            System.out.println(set);
            if(set.size()==1&&(i+k>=s.length()||s.charAt(i+k)!=s.charAt(i+k-1))){
                return true;
            }}
        }
        return false;
    }
}