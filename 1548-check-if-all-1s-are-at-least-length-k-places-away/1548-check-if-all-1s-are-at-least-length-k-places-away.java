class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=0;
        int ind=0;
        for(int i=0;i<nums.length;i++) if(nums[i]==1) {ind=i;break;}
        for(int i=ind;i<nums.length;i++){
            if(nums[i]==0) c++;
            else {
                if(c<k&&i!=ind) return false;
                c=0;}
            
        }
        return true;
    }
}