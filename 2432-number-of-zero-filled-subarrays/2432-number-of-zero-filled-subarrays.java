class Solution {
    public long zeroFilledSubarray(int[] nums) {
         long c = 0;
        long ans = 0;

        for ( int i =0; i<nums.length;i++){
            if(nums[i] == 0){
                c++; 
                ans += c;
            }
            else { 
                c = 0;
            }
        }
        return ans;
    }
}