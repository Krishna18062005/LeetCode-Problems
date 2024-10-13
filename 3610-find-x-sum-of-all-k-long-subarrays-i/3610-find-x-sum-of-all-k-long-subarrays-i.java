class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
      
        int[] ans=new int[nums.length-k+1];
        for(int i=0;i+k<=nums.length;i++){
            ans[i]=sum(nums,i,k,x);
        }
        return ans;

    }
    public static int sum(int[] nums,int s,int k,int x){
        int[] na=new int[k];
        int ix=0;
        for(int i=s;i<s+k;i++){
            na[ix++]=nums[i];
        }
        Set<Integer> set=new HashSet<>();
        for(int i:na) set.add(i);
        if(x>set.size()) return sum(na);
        int c=0;
        int su=0;
        int[] fre=new int[51];
        Arrays.sort(na);
        for(int i:na) fre[i]++;
        while(c<x){
            int max=0;
            int maxi=0;
            for(int i :na){
                if(fre[i]>=max){
                    max=fre[i];
                    maxi=i;
                }}
                fre[maxi]=0;
                int cc=0;
                while(cc<max){
                    su+=maxi;
                    cc++;
                }
                c++;
       }
        return su;
    }
    public static int sum(int[] a){
        int s=0;
        for(int i:a){
            s+=i;
        }
        return s;
    } 

}