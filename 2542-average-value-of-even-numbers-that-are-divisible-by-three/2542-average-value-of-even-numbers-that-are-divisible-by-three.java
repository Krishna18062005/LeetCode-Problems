class Solution {
    public int averageValue(int[] nums) {
       int c=0;
       int s=0;
       for(int i:nums){
        if(i%6==0){
            c++;
            s+=i;
        }
       } 
       if(c==0) return 0;
       return s/c;
    }
}