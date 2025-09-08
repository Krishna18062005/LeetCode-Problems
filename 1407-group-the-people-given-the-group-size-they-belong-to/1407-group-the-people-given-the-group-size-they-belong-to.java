class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            List<Integer> lst=map.getOrDefault(groupSizes[i],new ArrayList<>());
            lst.add(i);
            map.put(groupSizes[i],lst);
        }
        System.out.println(map);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i:map.keySet()){
            int t=map.get(i).size()/i;
            List<Integer> ls=map.get(i);
            int ind=0;
            while(t-->0){
            List<Integer> a=new ArrayList<>();
            
            for(int j=0;j<i;j++){
                a.add(ls.get(ind++));

            }
            ans.add(a);}
        }
        return ans;
    }
}