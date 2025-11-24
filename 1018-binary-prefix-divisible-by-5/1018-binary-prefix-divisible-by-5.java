class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ls=new ArrayList<>();
        long n=0;
        for(int i:nums){
            n=n*2+i;
            n%=5;
            ls.add(n%5==0);
        }
        return ls;
    }
}