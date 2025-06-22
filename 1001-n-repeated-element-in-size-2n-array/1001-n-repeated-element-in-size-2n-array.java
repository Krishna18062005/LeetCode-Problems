class Solution {
    public int repeatedNTimes(int[] nums) {
        int[] arr=new int[10001];
        for(int i:nums){
            arr[i]++;
            if(arr[i]>1) return i;
        }
        return -1;
    }
}