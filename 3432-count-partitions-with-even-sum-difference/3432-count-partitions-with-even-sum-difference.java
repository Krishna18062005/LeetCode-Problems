class Solution {
    public int countPartitions(int[] nums) {
        int []pa=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            pa[i]+=nums[i];
            if(i!=0)
            pa[i]+=pa[i-1];
        }
     
        int c=0;
        int s=0;
        for(int i=0;i<nums.length-1;i++){
        
            if((pa[nums.length-1]-pa[i]-pa[i])%2==0){
                c++;
            }
        }
        return c;
    }
}