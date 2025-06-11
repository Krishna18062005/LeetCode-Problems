class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int lf[] = new int[26];
        licensePlate=licensePlate.toLowerCase();
        for (char ch : licensePlate.toCharArray()) {
            if (ch<='z'&&ch>='a') {
                lf[ch - 'a']++;
            }
        }
        String res=null;
        for (int i = 0; i < words.length; i++) {
            int freq[] = new int[26];
            for (char ch : words[i].toCharArray()) {
                freq[ch - 'a']++;
            }

            boolean bool = true; 
            for (int k = 0; k < 26; k++) {
                if (lf[k] > freq[k]) {
                    bool = false;
                    break;
                }
            }

            if (bool){
                if(res==null || words[i].length()<res.length())
                res=words[i];
            }
        }

        return res;
    }
}