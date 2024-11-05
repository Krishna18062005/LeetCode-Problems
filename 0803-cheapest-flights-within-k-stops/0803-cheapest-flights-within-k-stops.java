class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        
        int[] di=new int[n];
        Arrays.fill(di,Integer.MAX_VALUE);
        di[src]=0;
       for(int i=0;i<=k;i++){
             int[] dis=di.clone(); 
            for(int j=0;j<flights.length;j++){
               
                if(di[flights[j][0]]!=Integer.MAX_VALUE){
                    
                    dis[flights[j][1]]=Math.min(di[flights[j][0]]+flights[j][2],dis[flights[j][1]]);
                
                }
            }
           di=dis.clone();
        }
        

        return di[dst]==Integer.MAX_VALUE?-1:di[dst];
    }
}
