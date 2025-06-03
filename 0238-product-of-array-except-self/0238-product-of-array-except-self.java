class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int zC=0;
        int product=1;
        for(int i:nums){
            if(i==0) {
                zC++;
                if(zC>1) return ans;
            }
            else product*=i;
        }
        if(zC==1){
            for(int i=0;i<n;i++){
                ans[i]=nums[i]==0?product:0;
            }
            return ans;
        }
        else{
            for(int i=0;i<n;i++){
                ans[i]=product/nums[i];
            }
        }
        return ans;
    }
}