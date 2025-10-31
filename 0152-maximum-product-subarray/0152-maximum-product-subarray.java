class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length==1) return nums[0];
        int a=0;
        int b=0;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(a==0) a=1;
            if(b==0) b=1;
            a*=nums[i];
            b*=nums[nums.length-i-1];
            
            if(a>m){
                m=a;
            }
            if(b>m){
                m=b;
            }
            //System.out.print(m+" "+nums[i]+" ");
        }
        return m;
    }
}