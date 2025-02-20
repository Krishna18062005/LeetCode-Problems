class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int le=nums[0].length();
        int req=(int)Math.pow(le,2);
        Set<String> st=new HashSet<>();
        for(String i:nums){
            st.add(i);
        }
        for(int i=0;i<=req;i++){
            String str=Integer.toBinaryString(i);
            for(int j=str.length();j<le;j++){
                str='0'+str;
            }
            if(!st.contains(str)){
                return str;
            }
        }
        return "";
    }
}