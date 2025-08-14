class Solution {
    public String largestGoodInteger(String num) {
        for (int i = 9; i > 0; i--)
            if (num.contains(i * 111 + ""))
                return (i * 111 + "");
        return (num.contains("000")) ? "000" : "";
    }
}