class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a=0,b=0;
        Set<Integer> st=new HashSet<>();
        for(int i[]:grid){
            for(int j:i){
                if(st.contains(j)) a=j;
                st.add(j);
            }
        }
        int n=grid.length;
        for(int i=1;i<=n*n;i++){
            if(!st.contains(i)) b=i;
        }
        int ans[]=new int[2];
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}