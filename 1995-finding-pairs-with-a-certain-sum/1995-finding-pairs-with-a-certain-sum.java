class FindSumPairs {

    int[] nums1;
    int[] nums2;
    HashMap<Integer,Integer> has;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.has = new HashMap<>();
        for(int i:nums2) has.put(i,has.getOrDefault(i,0)+1);
    }
    
    public void add(int index, int val) {
        has.put(nums2[index],has.get(nums2[index])-1);
        nums2[index]+=val;
        has.put(nums2[index], has.getOrDefault(nums2[index], 0) + 1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int j:nums1){
            int t = tot-j;
            count+= has.getOrDefault(t,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */