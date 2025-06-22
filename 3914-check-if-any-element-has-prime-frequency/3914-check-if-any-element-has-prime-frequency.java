class Solution {
    public boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        if(nums.length==1) return false;
       int max=-1;
       for(int i:nums){
        max=Math.max(max,i);
       }

       int freq[]=new int[max+1];
       for(int i=0;i<nums.length;i++){
        freq[nums[i]]++;
       } 
      // System.out.println(Arrays.toString(freq));
       for(int i=0;i<=max;i++){
        if(isPrime(freq[i])){
            return true;
        }
       }
       return false;
    }
}