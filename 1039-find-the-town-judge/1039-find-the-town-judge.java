class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDe=new int[n+1];
        int[] ouDe=new int[n+1];
        for(int i[]:trust){
            inDe[i[1]]++;
            ouDe[i[0]]++;
        }
        for(int i=1;i<=n;i++){
            if(inDe[i]==n-1&&ouDe[i]==0){
                return i;
            }
        }
        return -1;
    }
}