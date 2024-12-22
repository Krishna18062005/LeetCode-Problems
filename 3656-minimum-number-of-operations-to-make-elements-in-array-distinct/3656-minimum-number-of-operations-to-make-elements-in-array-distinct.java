class Solution {
    public int minimumOperations(int[] nums) {
        int[] fre=new int[101];
        for(int i:nums) fre[i]++;
        int c=0;
        for(int i=0;i<=nums.length;i+=3){
            if(dis(nums,i,fre)) return c;
            else c++;
        }
        return c;
    }
    private static boolean dis(int []ar,int p,int []fre){
        if(p>=3)
        for(int i=p-3;i<p;i++){
            fre[ar[i]]--;
        }
        for(int i:fre){
            if(i>1) return false;
        }
        return true;
    }
}