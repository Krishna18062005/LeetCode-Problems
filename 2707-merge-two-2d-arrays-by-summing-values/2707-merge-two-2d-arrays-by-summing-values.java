class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

          HashMap <Integer,Integer> map = new HashMap<>();

          for(int[] element: nums1){
            map.put(element[0],element[1]);
          }

          for(int[] e: nums2){
            map.put(e[0],map.getOrDefault(e[0],0)+e[1]);
          }

          int size=map.size();

          int[][] ans= new int[size][2];

          int index=0;

          for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans[index][0]=entry.getKey();
            ans[index][1]=entry.getValue();
            index++;
          }
        Arrays.sort(ans,(a,b)->a[0]-b[0]);

          return ans;
    }
}