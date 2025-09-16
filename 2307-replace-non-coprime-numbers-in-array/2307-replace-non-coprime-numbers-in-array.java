class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for (int i : nums) {
            if (st.empty()) {
                st.push(i);
            } else {
                int cur = i;

                while (!st.empty() && gcd(cur, st.peek()) > 1) {
                    int nu = st.pop();
                    cur = (int) ((long) nu * (cur / gcd(nu, cur))); // LCM
                }
                st.push(cur);

            }

        }
        List<Integer> ans = new ArrayList<>();
        while (!st.empty()) {
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        return ans;
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}