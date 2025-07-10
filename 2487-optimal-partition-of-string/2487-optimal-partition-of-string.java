class Solution {
    public int partitionString(String s) {
        int[] arr = new int[26];
        int ans =1;
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(arr[t-'a']!=0){
                ans++;
                Arrays.fill(arr,0);
            }
            arr[t-'a']++;
        }
        return ans;
    }
}