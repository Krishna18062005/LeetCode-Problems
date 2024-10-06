class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        StringBuilder r=new StringBuilder(s);
        return s.equals(r.reverse().toString());

    }
}