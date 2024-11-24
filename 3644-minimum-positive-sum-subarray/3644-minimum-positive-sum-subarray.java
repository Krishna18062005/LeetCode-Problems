class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            sum=Math.min(minPos(nums,i),sum);
            //System.out.print(sum);
        }
        return (sum==Integer.MAX_VALUE)?-1:sum;
        
        
    }
    public static int minPos(List<Integer> num,int k){
        
        int s=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            s+=num.get(i);
        }
        if(s>0) min=s;
        for(int i=k;i<num.size();i++){
            s+=num.get(i)-num.get(i-k);
            if(s>0) min=Math.min(min,s);
        }
        return min;
    }
}