class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int max=0;
        for(int i:nums) if(i>max) max=i;
        int[] freq=new int[max+1];
        for(int i:nums) freq[i]++;
        int s=0;
        for(int i=1;i<=max;i++){
            if(freq[i]!=0&&freq[i]%k==0) s+=(freq[i]*i);
        }
        return s;
    }
}