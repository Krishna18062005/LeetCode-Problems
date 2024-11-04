class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        Set<String> set=new HashSet<>(Arrays.asList(sentence.split("")));
       return set.size()==26;        
    }
}