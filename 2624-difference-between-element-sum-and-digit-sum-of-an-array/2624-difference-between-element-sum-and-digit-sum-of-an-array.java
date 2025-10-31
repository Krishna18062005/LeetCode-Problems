class Solution {
    public int differenceOfSum(int[] nums) {
        int ts=0;
        int ds=0;
        for(int i:nums){
            ts+=i;
            while(i>0){
                ds+=(i%10);
                i/=10;
            }
        }
        return (int)Math.abs(ts-ds);
    }
}