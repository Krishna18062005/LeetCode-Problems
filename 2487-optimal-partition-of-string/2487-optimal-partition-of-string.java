class Solution {
    public int partitionString(String s) {
        int[] fr = new int[26];
        int as =1;
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(fr[t-'a']!=0){
                as++;
                Arrays.fill(fr,0);
            }
            fr[t-'a']++;
        }
        return as;
    }
}