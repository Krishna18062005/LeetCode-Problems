class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
         int[] p = new int[26];
       List<String> lst = new ArrayList<>();
       boolean flag = true;
        for (int i = 0; i < words2.length; i++) {
            String s = words2[i];
            int[] q = new int[26];
            count(q,s);
            for (int j = 0; j < s.length(); j++) {
                p[s.charAt(j)-'a'] = Math.max(p[s.charAt(j)-'a'],q[s.charAt(j)-'a']);
            }
        }
        for(String ss : words1){
            int[] r = new int[26];
            count(r,ss);
            for (int i = 0; i < 26; i++) {
                if(p[i]>r[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                lst.add(ss);
            }
            flag = true;
        }
        return lst;
    }
     public static void count(int[] q, String s){
        for (int i = 0; i < s.length(); i++) {
            q[s.charAt(i)-'a']++;
        }
    }
}