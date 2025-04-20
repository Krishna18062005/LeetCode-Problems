class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long ans = 0;
        boolean[] seen = new boolean[instructions.length];
        
        int pos = 0;
        while (pos >= 0 && pos < instructions.length && seen[pos] == false) {
            seen[pos] = true;
            if (instructions[pos].charAt(0) == 'a') {
                ans += values[pos];
                pos++;
            } else {
                pos += values[pos];
            }
        }
        
        return ans;
    }
}