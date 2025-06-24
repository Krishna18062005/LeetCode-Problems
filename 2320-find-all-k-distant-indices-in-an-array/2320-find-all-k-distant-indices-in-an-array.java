class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans=new ArrayList<Integer>();
        int en=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=key){
                continue;
            }
            int st=Math.max(en,i-k);
            en=Math.min(i+k,nums.length-1)+1;
            for(int j=st;j<en;j++){
              
                    ans.add(j);
               
            }
        }
        return ans;
    }
}