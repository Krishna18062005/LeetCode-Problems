class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        int ix=0;
        for(int i:nums){
            if(i%2==0) ans[ix++]=-1;
            else
            for(int j=1;j<i;j++){
                if((j|(j+1))==i){
                    ans[ix++]=j;
                    break;
                }
            }

        }
        return ans;
        }
}