class Solution {

    private int start = 0;
    private int end = 0;

    public String longestPalindrome(String s) {

        int n = s.length();
        char[] arr = s.toCharArray();
        helper(arr, n, 0);

        return s.substring(start, end+1);
    }

    private void helper(char[] arr, int n, int i) {
        if (i >= n) {
            return;
        }

        int left = i;
        int right = i;

        while (right < n-1 && arr[right+1] == arr[right]) right++;
        i = right;

        while (left > 0 && right < n-1) {
            if (arr[left-1] == arr[right+1]) {
                left--;
                right++;
            } else {
                break;
            }
        }

        if ((right - left) > (end - start)) {
            start = left;
            end = right;
        }

        helper(arr, n, i + 1);
    }
}