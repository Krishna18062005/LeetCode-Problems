class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backTrack(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    public static void backTrack(List<List<Integer>> ans,List<Integer> temp,int[] arr,int k){

        ans.add(new ArrayList<>(temp)); 
        for(int i=k;i<arr.length;i++){       
        temp.add(arr[i]);
        backTrack(ans,temp,arr,i+1);
        temp.remove(temp.size()-1);   }
    }
}