import java.util.*;
class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> st=new HashMap<>();
        for(int i:nums) {
            if(st.containsKey(i)){
                st.put(i,st.get(i)+1);
            }
            else
            st.put(i,1);}
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            if(!st.containsKey(i-1)&&!st.containsKey(i+1)&&st.get(i)==1) ans.add(i);
        }
        return ans;
    }
}