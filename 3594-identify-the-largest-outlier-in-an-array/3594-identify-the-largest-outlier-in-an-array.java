class Solution {
    public int getLargestOutlier(int[] nums) { 
        int ts=0;
        Arrays.sort(nums);
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i:nums){
            ts+=i;
            if(set.containsKey(i)){
                set.put(i,set.get(i)+1);
            }
            else
            set.put(i,1);
        }
        for(int i=nums.length-1;i>=0;i--){
             int com=ts-nums[i];
             int cnt=set.getOrDefault(com/2,0);
             if(com%2==0&&cnt>=2){
                return nums[i];    
             }
            if(com%2==0&&cnt>=1&&com/2!=nums[i]) return nums[i];
        }
        return -1;
    }
}