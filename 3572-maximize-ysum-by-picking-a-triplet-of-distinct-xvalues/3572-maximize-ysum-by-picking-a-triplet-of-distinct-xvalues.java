class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
       int n = x.length;
        Map<Integer, Integer> map = new HashMap<>();

        
        for (int i = 0; i < n; i++) {
            map.put(x[i], Math.max(map.getOrDefault(x[i], 0), y[i]));
        }

        if (map.size() < 3) return -1;

        List<Integer> vals = new ArrayList<>(map.values());
        vals.sort(Collections.reverseOrder()); 

        return vals.get(0) + vals.get(1) + vals.get(2); 
    }
}