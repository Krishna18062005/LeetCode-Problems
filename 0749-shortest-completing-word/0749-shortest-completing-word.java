class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] freqLP = new int[26];
        int licenseLen = 0;
        for (char c : licensePlate.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freqLP[c-'a']++;
                licenseLen++;
            } else if (c >= 'A' && c <= 'Z') {
                freqLP[c-'A']++;
                licenseLen++;
            }
        }
        String res = "";
        int minLen = Integer.MAX_VALUE;
        for (int i = 0, n = words.length; i < n; i++) {
            int wordLen = words[i].length();
            if (minLen > wordLen && wordLen >= licenseLen && isComplete(freqLP, words[i])) {
                res = words[i];
                minLen = wordLen;
            }
        }
        return res;
    }
    private boolean isComplete(int[] freq1, String s) {
        int[] freq2 = new int[26];
        for (char c : s.toCharArray()) {
            freq2[c-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq1[i] > freq2[i]) return false;
        }
        return true;
    }
}