class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1=-101;
        int min=101;
        int max2=-101;
        for(int i:nums){
            if(i<min){
              min =i;
            }
            if(i>max1){
                max2=max1;
                max1=i;
            }
            else if(i>max2){
                max2=i;
            }
        }
        return max2+max1-min;
    }
}