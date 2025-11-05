class Solution {
    public int minCost(String colors, int[] need) {
        int c=0;
        for(int i=0;i<need.length;i++){
            int st=i;
            int end=i+1;
            while(end<need.length&&colors.charAt(end)==colors.charAt(st)) end++;
            c+=help(st,end,need);
            //System.out.print(help)
            i=end-1;
        }
        return c;
    }
    public static int help(int s,int e,int[] need){
        if(s==e) return 0;
        int max=0;
        //if()
        int su=0;
        for(int i=s;i<e;i++ ){ max=Math.max(need[i],max);su+=need[i];}
        return su-max;
    }
}