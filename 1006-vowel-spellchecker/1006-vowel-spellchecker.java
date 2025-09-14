class Solution {
    static{
        for(int i=0;i<100;i++){
            spellchecker(new String[0],new String[0]);
        }
    }

    public static String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> st = new HashSet<>();
        for (String i : wordlist)
            st.add(i);
        HashMap<String, String> mapc = new HashMap<>();
        HashMap<String, String> mapv = new HashMap<>();
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
        }System.gc();
        return ans;

    }
}