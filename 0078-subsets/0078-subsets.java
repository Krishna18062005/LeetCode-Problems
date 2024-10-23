class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backTrack(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    public static void backTrack(List<List<Integer>> ans,List<Integer> temp,int[] arr,int k){
        while(k<arr.length){   
            temp.add(arr[k]);
            backTrack(ans,temp,arr,++k);
            temp.remove(temp.size()-1);
        }
        ans.add(new ArrayList<>(temp)); 
    }
}