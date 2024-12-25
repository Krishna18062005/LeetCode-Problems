class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> ls=new ArrayList<>();
        int start=0;int end=0;int max=0;
        while(end<s.length()){
            if(!ls.contains(s.charAt(end))){
                ls.add(s.charAt(end));
                end++;
                max=Math.max(max,ls.size());
            }else{
                ls.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    }
}
