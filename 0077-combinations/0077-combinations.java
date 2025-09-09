class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> tres = new ArrayList<>();
        helper(1, ans, tres, n, k);
        return ans;
    }

    void helper(int st, List<List<Integer>> ans, List<Integer> res, int n, int k) {
        if (res.size() == k) {
            ans.add(new ArrayList(res));
            return;
        }
        for (int i = st; i <= n; i++) {
            res.add(i);
            helper(i + 1, ans, res, n, k);
            res.remove(res.size() - 1);
        }
    }

}