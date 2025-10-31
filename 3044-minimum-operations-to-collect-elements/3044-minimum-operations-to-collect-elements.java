class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        int[] freq=new int[51];
        for(int i:nums) freq[i]++;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)<=k&&freq[nums.get(i)]==1){
                return nums.size()-i;
            }
            freq[nums.get(i)]--;
        }
        return 0;
    }
}