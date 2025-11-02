class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=101;
        int max=0;
        
        for(int i:nums){
           if(max<i) max=i;
           if(min>i) min=i;
        }

        int[] fr=new int[max-min+1];
        for(int i:nums) fr[i-min]++;
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(fr[i-min]==0) ans.add(i);
        }
        return ans;
        
    }
}