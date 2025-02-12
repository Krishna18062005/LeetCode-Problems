class Solution {
    public int maximumSum(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int s=0;
            int t=i;
            while(t>0){
                s+=t%10;
                t/=10;
            }
            if(!map.containsKey(s)){
                
                map.put(s,i);

            }
            else{
                ans=Math.max(i+map.get(s),ans);
                int mxx=Math.max(i,map.get(s));
                map.put(s,mxx);
            }
        }
       // System.out.print(map);
        if(map.size()==nums.length) return -1;
       
        return ans;

    }
}