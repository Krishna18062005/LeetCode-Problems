class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> mpp = new HashMap<>();
        for (String w : words)
            mpp.put(w, mpp.getOrDefault(w, 0) + 1);

        int count = 0, alreadyPalindrome = 0;
        for (Map.Entry<String, Integer> e : mpp.entrySet()) {
            String w = e.getKey();
            int freq = e.getValue();
            String s = new StringBuilder(w).reverse().toString();
            if (w.equals(s)) {
                count += (freq / 2) * 4;
                if (freq % 2 == 1)
                    alreadyPalindrome = 1;
            } else if (w.compareTo(s) < 0 && mpp.containsKey(s)) {
                count += Math.min(freq, mpp.get(s)) * 4;
            }
        }
        return count + alreadyPalindrome * 2;
    }
}