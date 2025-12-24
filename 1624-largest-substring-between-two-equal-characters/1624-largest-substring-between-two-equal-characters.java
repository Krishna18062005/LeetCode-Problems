class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // int[] fr=new int[26];
        // for(char c:s.toCharArray()){
        //     fr[c-'a']++;
        // }
        int ans=-1;
        char[] ar=s.toCharArray();
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    if(ans<j-i-1){
                        ans=j-i-1;
                    }
                }
            }
        }
        return ans;
    }
}