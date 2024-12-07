class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> st=new HashSet<>();
        for (int i:nums){
            if(i<k) return -1;
            else if(i>k){
                st.add(i);
            }
        }
        return st.size();
    }
}