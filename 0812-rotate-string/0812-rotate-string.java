class Solution {
    static int c=1;
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()) return false;
    
        return (s+s).contains(goal);
    }
}