class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int c=1;
        int ind=0;
        int s=0;
        int[] ans=new int[num_people];
        while(s<candies){
            if(s+c<=candies)
            ans[ind%num_people]+=c;
            else{
                ans[ind%num_people]+=candies-s;
            }
            ind++;
            s+=c;
            c++;
        }
        return ans;
    }
}