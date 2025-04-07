class Solution {
    public int minimumPairRemoval(int[] nums) {
        int c=0;
        List<Integer> ns=new ArrayList<>();
        for(int i:nums){
            ns.add(i);
        }
        while(!isSorted(ns)){
            int minSum=99999;
            int ind=0;
            for(int i=1;i<ns.size();i++){
                if(minSum>ns.get(i-1)+ns.get(i)){
                    ind=i-1;
                    minSum=ns.get(i-1)+ns.get(i);
                }
            }
            ns.remove(ind+1);
            ns.set(ind,minSum);
                c++;
        }
        return c;
    }
    public static boolean isSorted(List<Integer> nums){
        for(int i=1;i<nums.size();i++){
            if(nums.get(i-1)>nums.get(i)){
                return false;
            }
        }
        return true;
    }
}