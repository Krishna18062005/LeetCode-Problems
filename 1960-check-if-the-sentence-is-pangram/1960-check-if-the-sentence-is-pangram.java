class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] freq=new boolean[26];
        for(char i:sentence.toCharArray()){
            freq[i-'a']=true;
        }
        for(boolean i:freq) if(!i) return false; 
        return true;
    }
}