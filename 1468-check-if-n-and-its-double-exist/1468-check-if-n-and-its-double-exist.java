class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> st=new HashMap<>();
        for(int i:arr){
           st.put(i,st.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            if(st.containsKey(2*i)&&(i!=0)||(i==0)&&st.get(0)>=2) return true;
        }
        return false;
    }
}