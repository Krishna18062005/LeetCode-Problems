class Solution {
    public int minMirrorPairDistance(int[] A) {
         Map<Integer, Integer> pre = new HashMap<>();
        int n = A.length, res = n;
        for (int i = 0; i < n; ++i) {
            if (pre.containsKey(A[i])) {
                res = Math.min(res, i - pre.get(A[i]));
            }
            pre.put(reverse(A[i]), i);
        }

        return (res < n) ? res : -1;
    }
    private int reverse(int a) {
        int b = 0;
        while (a > 0) {
            b = b * 10 + a % 10;
            a /= 10;
        }
        return b;
    }
}