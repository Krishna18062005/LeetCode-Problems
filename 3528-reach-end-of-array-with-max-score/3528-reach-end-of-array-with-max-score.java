class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long ans=0;
        long prev=nums.get(0);
        int pri=0;
        for(int i=0;i<nums.size();i++){
            if(prev<nums.get(i)||i==nums.size()-1){
                ans+=((i-pri)*prev);
                prev=nums.get(i);
                pri=i;
            }

        }
        return ans;
    }
}