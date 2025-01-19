class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long curr1 = 0, curr2 = k;
        
        for (int i = 0; i < arr.length; i++) {
            curr1 += Math.abs(brr[i] - arr[i]);
        }
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        for (int i = 0; i < arr.length; i++) {
            curr2 += Math.abs(brr[i] - arr[i]);
        }
        
        return Math.min(curr1, curr2);
    }
}