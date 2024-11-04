class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<String> set=new HashSet<>(Arrays.asList(sentence.split("")));
       return set.size()==26;        
    }
}