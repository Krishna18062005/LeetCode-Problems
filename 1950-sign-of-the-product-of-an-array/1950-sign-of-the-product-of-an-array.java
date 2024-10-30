class Solution {
    public int arraySign(int[] nums) {
        int mc=0;
        for(int i:nums){
            if(i==0) return 0;
            if(i<0) mc++;
        }
        return (mc%2==0)?1:-1;
    }
}