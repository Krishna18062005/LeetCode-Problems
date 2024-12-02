class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] ar=sentence.split("\\s+");
        for(int i=1;i<=ar.length;i++){
            if(ar[i-1].startsWith(searchWord)) return i;
        }
        return -1;
    }
}