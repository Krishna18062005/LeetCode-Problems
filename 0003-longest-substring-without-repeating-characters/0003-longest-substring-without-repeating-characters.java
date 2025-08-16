class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hash = new HashMap<>();
        int left = 0, maxi = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hash.containsKey(ch)) {
                left = Math.max(left, hash.get(ch) + 1);
            }
            maxi = Math.max(maxi, i - left + 1);
            hash.put(ch, i);
        }
        return maxi;
    }
}