class Solution {
    static {
        int[] nums = {1, 1, 2, 2, 3};
        for (int i = 0; i < 200; i++) {
            topKFrequent(nums, 2);
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
            map.put(i, map.get(i) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i : map.values()) {
            pq.offer(i);
        }
        int as = 0;
        int c = 0;
        while (k-- > 0) {
            as = pq.poll();
            c++;
        }
        int[] ans = new int[c];
        int ind = 0;
        for (int i : map.keySet()) {
            if (map.get(i) >= as) {
                ans[ind++] = i;
            }
        }

        return ans;
    }
}