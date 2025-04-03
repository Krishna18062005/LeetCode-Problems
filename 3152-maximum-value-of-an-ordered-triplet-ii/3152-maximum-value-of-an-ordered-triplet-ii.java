class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = Integer.MIN_VALUE;
        long maxDiff = Integer.MIN_VALUE;
        long maxTri = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++){
            max = Math.max(max,nums[i]);
            maxDiff = Math.max(maxDiff,max-nums[i+1]);
            maxTri = Math.max(maxTri,maxDiff*nums[i+2]);
        }
        return maxTri<0?0:maxTri;
        
    }
}