class Solution {
    public void sortColors(int[] nums) {
        int c1=0;
        int c2=0;
        int c0=0;
        for(int i:nums){
            if(i==0){
                c0++;
            }
            else if(i==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        int j=0;
        for(int i=0;i<c0;i++)    nums[j++]=0;
        for(int i=0;i<c1;i++)    nums[j++]=1;
        for(int i=0;i<c2;i++)    nums[j++]=2;     

    }
}