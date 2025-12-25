class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> as=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            as.add(index[i],nums[i]);
        }
        int[] ans=new int[as.size()];
        for(int i=0;i<as.size();i++){
            ans[i]=as.get(i);
        }
        return ans;
    }
}