class Solution {
    public int longestSubsequence(int[] nums) {
        int x=0;
        int c=0;
        for(int i:nums){
            if(i!=0) c++;
            x^=i;
        }
        if(c==0) return 0;
        if(x==0) return nums.length-1;
        return nums.length;
    }
}