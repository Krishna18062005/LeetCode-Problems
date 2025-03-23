class Solution {
    public int maxContainers(int n, int w, int m) {
        return ((n*n)<(m/w))?n*n:m/w;
            }
}