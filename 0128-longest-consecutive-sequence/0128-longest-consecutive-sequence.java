import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=0) return nums.length;
       Arrays.sort(nums);
       int c=1;
       int l=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
        if(nums[i]==nums[(i-1)]+1)
        c++;
        else{
            l=Math.max(l,c);
            c=1;}
       }}
       System.gc();
    return Math.max(c,l);
}
}