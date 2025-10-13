class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq=new int[101];
        for(int i:nums) freq[i]++;
        int s=0;
        for(int i=1;i<101;i++){
            if(freq[i]!=0&&freq[i]%k==0) s+=(freq[i]*i);
        }
        return s;
    }
}