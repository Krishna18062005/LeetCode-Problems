class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        int n = arr.length;

        long woSort = 0;    // without sorting answer
        for (int i = 0; i < n; i++) {
            long d = Math.abs(arr[i] - brr[i]);
            woSort += d;
        }

        Arrays.sort(arr);
        Arrays.sort(brr);
        long afterSort = k;    // after sorting answer
        for (int i = 0; i < n; i++) {
            long d = Math.abs(arr[i] - brr[i]);
            afterSort += d;
        }
        
        return Math.min(woSort, afterSort);
    }
}