class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int [] ans=new int[groups.length];
        Arrays.fill(ans,-1);
        HashMap<Integer,Integer> el=new HashMap<>();
        int max=0;
        int ind=0;
        for(int i:elements){
            if(!el.containsKey(i))
            el.put(i,ind);
            ind++;
        }
        
        ind=0;
        for(int i:groups){
            int an=Integer.MAX_VALUE;
            
         for(int j=1;j*j<=i;j++){
            if(i%j==0){
                if(el.containsKey(j)){
                    
                    an=Math.min(el.get(j),an);
                }
                if(el.containsKey(i/j)){
                    
                    an=Math.min(el.get(i/j),an);
                }
            }

         }
         
         ans[ind]=(an==Integer.MAX_VALUE)?-1:an;
         ind++;
        }
        
        
        return ans;
    }
}