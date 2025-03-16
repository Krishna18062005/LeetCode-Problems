class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = -101;
        for(int num : nums) {
            if(num >= 0) set.add(num);
            if(num < 0) min = Math.max(min, num);
        }
        if(set.isEmpty()) return min;
        int sum = 0;
        for(int key : set) sum += key;
        return sum;
    }
}