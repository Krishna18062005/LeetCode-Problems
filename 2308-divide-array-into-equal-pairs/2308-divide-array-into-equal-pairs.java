class Solution {
    public boolean divideArray(int[] nums) {
        int[] ar=new int[501];
        for(int i:nums){
            ar[i]++;
        }
        for(int i:ar){
            if(i%2==1) return false;
        }
        return true;
    }
}