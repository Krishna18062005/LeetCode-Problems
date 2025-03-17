class Solution {
    public char repeatedCharacter(String s) {
         int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==0) arr[s.charAt(i)-'a']=1;
            else return s.charAt(i);
        }
        return 'a';
    }
}