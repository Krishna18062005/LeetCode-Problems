class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int i:rolls) sum+=i;
        int reqs=mean*(n+rolls.length);
        reqs-=sum;
        int mre=reqs/n;
        if(sum+(n*6)<reqs+sum||mre==0||reqs<0){
            return new int[0];
        }
        int ex=reqs%n;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=mre;
            while(ans[i]<6&&ex>0){
                ans[i]+=1;
                ex--;
            }
        }
        return ans;
    }
}