class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int s=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            int j=Math.max(i-k,-1);
            int j2=Math.min(i+k,n);
            if(j==-1||nums[j]<nums[i]) {
                if(j2==n||nums[j2]<nums[i]){
                    s+=nums[i];
                }
            } 
            
            
        }
        return s;
    }
}