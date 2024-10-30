class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy=arr.clone();
        Arrays.sort(copy);
        int r=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:copy){
            if(!map.containsKey(i)) map.put(i,r++);
        }
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}