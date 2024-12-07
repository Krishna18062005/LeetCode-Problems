class Solution {
    public int minOperations(int[] nums, int k) {
        int[] fr=new int[101];
        for (int i:nums){
            if(i<k) return -1;
            else if(i>k){
                fr[i]++;
            }
        }
        int c=0;
        for(int i:fr){
            if(i!=0){
                c++;
            }
        }
        return c;
    }
}