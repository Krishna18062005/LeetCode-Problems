class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int c=0;
        int ind=0;
        int n=nums.size();
        for(int i=1;i<nums.size();i++){
             
            if(nums.get(i)<nums.get(i-1)) {
                c++;
                ind=i;
            }
        }
        if(ind == 0) return 0;
       if(nums.get(n - 1) > nums.get(0)) return -1;
        if(c>1) return -1;
        return ind==0?0:nums.size()-ind;
    }
}