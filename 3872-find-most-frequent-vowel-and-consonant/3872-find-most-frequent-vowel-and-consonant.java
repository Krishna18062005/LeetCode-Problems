class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int vm=0;
        int cm=0;
        for(int i=0;i<26;i++){
            char ch=(char)(i+97);
            if("aeiou".contains(""+ch)) vm=Math.max(vm,freq[i]);
            else cm=Math.max(cm,freq[i]);
        }
        return cm+vm;
    }
}