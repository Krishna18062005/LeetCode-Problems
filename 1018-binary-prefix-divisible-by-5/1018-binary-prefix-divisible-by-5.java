class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ls=new ArrayList<>();
        long n=0;
        for(int i=0;i<nums.length;i++){
            n=n*2+nums[i];
            n%=5;
            ls.add(n%5==0);
        }
        return ls;
    }
}