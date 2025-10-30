class Solution {
    public int minCostToMoveChips(int[] position) {
        int c = 0;
        for (int i : position)
            if (i % 2 == 0)
                c++;
        return (int) Math.min(c, position.length - c);
    }
}