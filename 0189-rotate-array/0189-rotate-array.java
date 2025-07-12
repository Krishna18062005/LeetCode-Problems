class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<=1) return;
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
        
    }
    static void rev(int[] ar,int i,int j){
        while(i<j){
            int t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
            i++;
            j--;
        }
    }
}