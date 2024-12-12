class Solution {
    public long pickGifts(int[] gifts, int k) {
        for(int i=0;i<k;i++){
            int maxi=0;
            int max=gifts[0];
            for(int j=1;j<gifts.length;j++){
                if(max<gifts[j]){
                    maxi=j;
                    max=gifts[j];
                }
            }
            gifts[maxi]=(int)Math.sqrt(gifts[maxi]);
        }
        long s=0;
        for(int i:gifts) s+=(long)i;
        return s;
          }
}