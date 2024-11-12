class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        // int max=0;
        // for(int j[]:items){
        //     max=Math.max(j[0],max);
        // }
        // int[] dp=new int[max+1];
      
        // for(int i[] :items){
        //     dp[i[0]]=Math.max(i[1],dp[i[0]]);
        // }
        // for(int i=1;i<=max;i++){
        //     dp[i]=Math.max(dp[i],dp[i-1]);
        // }
        // int []ans=new int[queries.length];
        // for(int i=0;i<queries.length;i++){
        //     if(queries[i]>max){
        //         ans[i]=dp[max];
        //     }
        //     else
        //     ans[i]=dp[queries[i]];
        // }
        // return ans;
        Arrays.sort(items,(a,b)->a[0]-b[0]);
        int max=0;
        for(int i=0;i<items.length;i++){
            items[i][1]=Math.max(items[i][1],max);
            max=Math.max(max,items[i][1]);
        }
        System.out.println(Arrays.deepToString(items));
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=0;
            int r=items.length-1;
            int an=0;
            while(l<=r){
                int mid=(l+r)/2;
                if(items[mid][0]==queries[i]){
                    an=items[mid][1];
                    l=mid+1;
                }
                else if(items[mid][0]<queries[i]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
           // System.out.println(l+" "+r);
            if(an!=0)
            ans[i]=an;           
            else if(items.length>r&&r>=0)
            ans[i]=items[r][1];
            else ans[i]=0;
        }
        return ans;


    }
}