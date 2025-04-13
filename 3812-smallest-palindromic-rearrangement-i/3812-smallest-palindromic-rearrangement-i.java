class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder st = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0)
                continue;
            else {
                while (freq[i] >= 2) {
                    freq[i] -= 2;
                    st.append((char) (i + 'a'));
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                continue;
            } else {
                char mid = ((char) (i + 'a'));
                return st.toString() + mid + st.reverse().toString();
            }
        }
        return st.toString() + st.reverse().toString();

    }
}