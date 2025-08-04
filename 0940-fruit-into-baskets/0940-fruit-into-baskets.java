class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length <= 2) return fruits.length;

        int fc = -1, sc = -1; // fruit types
        int fi = -1, si = -1; // last seen indices of fc and sc
        int start = 0;        // start of current valid window
        int max = 0;

        for (int i = 0; i < fruits.length; i++) {
            int curr = fruits[i];

            if (fc == -1 || curr == fc) {
                fc = curr;
                fi = i;
            } else if (sc == -1 || curr == sc) {
                sc = curr;
                si = i;
            } else {
                // Third fruit found, remove the older one
                if (fi < si) {
                    start = fi + 1;
                    fc = curr;
                    fi = i;
                } else {
                    start = si + 1;
                    sc = curr;
                    si = i;
                }
            }

            // update last index of current fruit
            if (curr == fc) fi = i;
            if (curr == sc) si = i;

            max = Math.max(max, i - start + 1);
        }

        return max;
    }
}
