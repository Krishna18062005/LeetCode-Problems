class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> st = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> mapc = new HashMap<>();
        Map<String, String> mapv = new HashMap<>();
        for (String i : wordlist) {
            String lower = i.toLowerCase();
            String vowel = lower.replaceAll("[aeiou]", "#");
            mapc.putIfAbsent(lower, i);
            mapv.putIfAbsent(vowel, i);
        }
        String[] ans = new String[queries.length];
        int ind = 0;
        for (String i : queries) {
            if (st.contains(i)) {
                ans[ind++] = i;
            } else {
                String lower = i.toLowerCase();
                String vowel = lower.replaceAll("[aeiou]", "#");
                if (mapc.containsKey(lower)) {
                    ans[ind++] = mapc.get(lower);
                } else if (mapv.containsKey(vowel))
                    ans[ind++] = mapv.get(vowel);
                else {
                    ans[ind++] = "";
                }
            }
        }
        return ans;

    }
}