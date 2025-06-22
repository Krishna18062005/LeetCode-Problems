class Solution {
    public boolean isPrime(int n){
        if(n<=1) return false;
        if(n==3||n==2) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=4;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
    
       int max=-1;
       for(int i:nums){
        max=Math.max(max,i);
       }
       int freq[]=new int[max+1];
       for(int i:nums){
        freq[i]++;
       } 
       System.out.println(Arrays.toString(freq));
       for(int i:freq){
        if(isPrime(i)){
            return true;
        }
       }
       return false;
    }
}