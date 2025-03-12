class Solution {
    public int maximumCount(int[] nums) {
        int c=0;
        int cp=0;
        for(int i:nums){
            if(i<0){
                c++;
            }
            if(i>0) {
                cp++;
            }
            

        }
        return (int)Math.max(c,cp);
    }
}