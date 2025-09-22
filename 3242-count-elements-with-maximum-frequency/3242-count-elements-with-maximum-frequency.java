class Solution {
    public int maxFrequencyElements(int[] nums) {
        int fr[] =new int[101];
        for(int i:nums){
            fr[i]++;
        }
        int max=0;
        
        for(int i=0;i<101;i++){
            if(max<=fr[i]){
                
                max=fr[i];
            }

        }
        int c=0;
        for(int i:fr){
            if(i==max) c+=i;
        }
        return c;
    }
}