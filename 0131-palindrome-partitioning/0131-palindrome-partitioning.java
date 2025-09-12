import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> path = new ArrayList<>();
        fxn(0, s, path, list);
        return list;
    }

    public void fxn(int index, String s, List<String> path, List<List<String>> list) {
        if (index == s.length()) {
            list.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                fxn(i + 1, s, path, list);
                path.remove(path.size() - 1); // backtrack
            }
        }
    }

    boolean isPalindrome(String s, int st, int end) {
        while (st < end) {
            if (s.charAt(st++) != s.charAt(end--)) return false;
        }
        return true;
    }
}