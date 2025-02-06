class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cC = 0;
        int i = 0;
        while (i < s.length && cC < g.length) {
            if (s[i] >= g[cC]) {
                cC++;
            }
            i++;
        }
        return cC;
    }

}