class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       List<int[]> lst = new ArrayList<>();

       for(int[] ar:intervals){

        int n=lst.size();
        if(n==0 || ar[0]>lst.get(n-1)[1]){
            lst.add(ar);
        }
        else{
            lst.get(n-1)[1]=Math.max(ar[1],lst.get(n-1)[1]);
        }
       }
       return lst.toArray(new int[lst.size()][2]);
    }
}