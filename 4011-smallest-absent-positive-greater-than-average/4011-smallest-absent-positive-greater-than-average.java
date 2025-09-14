class Solution {
    public int smallestAbsent(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int s=0;
        for(int i:nums){
            set.add(i);
            s+=i;
        }
        s/=nums.length;
        //System.out.println(s);
        s=Math.max(s,0);
        s++;
        while(s!=102){
            if(!set.contains(s)) return s;
            s++;
        }
        return 0;
    }
}