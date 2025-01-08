class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
               return new int[]{-1, -1};
        }
        int[] ans=new int[2];
        int i=0;
        int j=nums.length-1;
        while(i<j){
           int mid=i + (int) Math.floor((double)(j-i)/2);
          //  System.out.print(mid);
            if(nums[mid]>=target){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        //System.out.print("Rounf1");
         if(nums[i] != target ){
            return new int[]{-1, -1};
        }
        ans[0]=i;
        i=0;
        j=nums.length-1;
        while(i<j){
            int mid=i + (int) Math.ceil((double)(j-i)/2);
          //   System.out.println(i+" "+j);
            if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid;
            }
        }
        ans[1]=i;
        return ans;
    }
}
