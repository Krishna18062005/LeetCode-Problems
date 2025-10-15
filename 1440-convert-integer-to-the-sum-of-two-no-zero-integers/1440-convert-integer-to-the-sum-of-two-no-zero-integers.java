class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        for(int i=1;i<=n;i++){
            if(help(i)&&help(n-i)){
                return new int[]{i,n-i};
            }
        }
        return new int[]{-1,-1};
    }
    boolean help(int a){
        return !((""+a).contains("0"));
    }
}