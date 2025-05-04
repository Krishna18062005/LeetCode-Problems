class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<dominoes.length-1;i++){
        //     for(int j=i+1;j<dominoes.length;j++){
                
        //         int a=dominoes[i][0];
        //         int b=dominoes[i][1];
        //         int c=dominoes[j][0];
        //         int d=dominoes[j][1];

        //        if((a==c&&b==d)||(a==d&&b==c)) 
        //         ans++;
        //     }
        // }
        for(int i[]:dominoes){
            int min=Math.min(i[0],i[1]);
            int max=Math.max(i[1],i[0]);
            
            ans+=map.getOrDefault(min*10+max,0);
            map.put(min*10+max,map.getOrDefault(min*10+max,0)+1);
        }

        return ans;
    }
}