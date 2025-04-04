class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans=0;
        int n=citations.length;
        for(int i=0;i<n;i++){
            if(n-i<=citations[i])
                return n-i;
        }       
        return ans;
    }

}