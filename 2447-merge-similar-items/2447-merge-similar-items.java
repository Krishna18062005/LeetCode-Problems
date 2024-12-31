class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Arrays.sort(items1,(a,b)-> a[0]-b[0]);
        Arrays.sort(items2,(a,b)-> a[0]-b[0]);
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<items1.length;i++){
            if(map.containsKey(items1[i][0])){
                map.put(items1[i][0],map.get(items1[i][0])+items1[i][1]);
            }
            else{
                map.put(items1[i][0],items1[i][1]);
            }
        }
        for(int i=0;i<items2.length;i++){
            if(map.containsKey(items2[i][0])){
                map.put(items2[i][0],map.get(items2[i][0])+items2[i][1]);
            }
            else{
                map.put(items2[i][0],items2[i][1]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(var a:map.entrySet()){
            int key=a.getKey();
            int val=a.getValue();
            List<Integer> lst=new ArrayList();
            lst.add(key);
            lst.add(val);
            ans.add(lst);
        }
        ans.sort((a,b)->a.get(0)-b.get(0));
        return ans;
    }
}