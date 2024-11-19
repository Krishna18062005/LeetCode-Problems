class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int prev=nums[0];
        int ans=0;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==prev){
                k++;
            }
            else{
                k=1;
            }
            if(k>2){ans++;continue;}
            else{
                nums[ind++]=nums[i];
            }
            prev=nums[i];


        }
        return nums.length-ans;
    }
}