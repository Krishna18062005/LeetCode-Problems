class Solution {
    public int binaryGap(int n) {

        int max = 0;
        int id = 0;
        int c = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                if (id != 0)
                    max = Math.max(max, c - id);
                id = c;
            }
            n = n >> 1;
            c++;
        }
        return max;
    }
}