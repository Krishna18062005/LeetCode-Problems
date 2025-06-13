class Solution {
    public String largestOddNumber(String num) {
        int i;
        for (i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0)
                break;
        }
        if (i == -1)
            return "";
        return num.substring(0, i + 1);
    }
}