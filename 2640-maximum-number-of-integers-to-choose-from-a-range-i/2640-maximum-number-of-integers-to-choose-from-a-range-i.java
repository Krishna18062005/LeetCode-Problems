class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set=new HashSet<>();
        for(int i:banned){
            if(i<=n) {
                set.add(i);
            }
        }
        int s=0;
        int c=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                if(s+i>maxSum) break;
                if(s+i<=maxSum){
                    s+=i;
                    c++;
                }

            }
        }
        return c;

        
    }
}