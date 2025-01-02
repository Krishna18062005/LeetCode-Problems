class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] pr=new int[words.length];
        int idx = 0;
        int prefix_sum=0;
        for(String word : words) pr[idx++] = (((word.charAt(0) == 'a'|| word.charAt(0) == 'e' || word.charAt(0) == 'i' ||  word.charAt(0) == 'o' || word.charAt(0) == 'u') && ( word.charAt(word.length()-1) == 'a' ||word.charAt(word.length()-1) == 'e' || word.charAt(word.length()-1) == 'i' || word.charAt(word.length()-1) == 'o' || word.charAt(word.length()-1 ) == 'u'))) ? ++prefix_sum : prefix_sum ;
        
        int[] ans=new int[queries.length];
        int ind=0;
        for(int i[]:queries){
            int f=i[0];
            int s=i[1];
            if(f==0)
            ans[ind]=pr[s];
            else{
                ans[ind]=pr[s]-pr[f-1];

            }
            ind++;
        }
        return ans;
        
    }
}

 