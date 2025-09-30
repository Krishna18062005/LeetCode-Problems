class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums) arr.add(i);
        while(arr.size()>1){
            ArrayList<Integer> newArr=new ArrayList<>();
            for(int i=1;i<arr.size();i++){
                newArr.add((arr.get(i-1)+arr.get(i))%10);
            }
            arr=newArr;

        }
        return arr.get(0);
    }
}