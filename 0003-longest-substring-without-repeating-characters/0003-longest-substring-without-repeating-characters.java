class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int left = 0, maxi = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (hash[ch] != -1) {
                left = Math.max(left, hash[ch]+1);
            }
            maxi = Math.max(maxi, i - left+1);
            hash[ch] = i;
        }
        return maxi;
    }
}