class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        int n = s.length();
        if (n == 0) return 0;
        
        int i = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;
        
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        
        while (i < n) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                ans = ans * 10 + (c - '0');
                if (sign == 1 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sign == -1 && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else break;
            i++;
        }
        
        return (int)(sign * ans);
    }
}
