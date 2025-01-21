class Solution {
    public boolean isPerfectSquare(int num) {
        int i=(int)Math.sqrt(num);
        return (i*i==num);
    }
}