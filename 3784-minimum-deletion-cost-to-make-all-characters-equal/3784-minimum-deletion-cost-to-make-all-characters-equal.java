class Solution {
    public long minCost(String s, int[] cost) {
        long[] hash = new long[26];
        char[] c = s.toCharArray();
        long t = 0 , m = 0;
        for(int i = 0; i < cost.length; i++) {
            t += cost[i];
            hash[c[i] - 'a'] += cost[i];
            if(hash[c[i] - 'a'] > m) m = hash[c[i] - 'a'];
        }
        return t- m;
    }
}