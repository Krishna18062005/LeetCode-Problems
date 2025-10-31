class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int[] ans=new int[2];
        int id=0;
        for(int i:nums){
            if(!set.add(i))
                ans[id++]=i;
        } 
        //Arrays.sort(ans);
        return ans;
    }
}