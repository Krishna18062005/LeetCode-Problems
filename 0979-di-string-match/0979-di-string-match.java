class Solution {
    public int[] diStringMatch(String s) {
        int ans[]=new int[s.length()+1];
        int Ic=0;
        int D=s.length();
        for(int i=0;i<s.length();i++){
            ans[i]=(s.charAt(i)=='I')?Ic++:D--;
        }
        ans[s.length()]=Ic;
        return ans;
    }
}