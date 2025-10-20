class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i=0;
        for(String k:operations)
            i=(k.charAt(1)=='-')?i-1:i+1;
        return i;
    }
}