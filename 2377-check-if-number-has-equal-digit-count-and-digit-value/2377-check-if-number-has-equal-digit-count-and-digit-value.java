class Solution {
    public boolean digitCount(String num) {
        int[] freq=new int[11];
        for(int i=0;i<num.length();i++){
            freq[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)-'0'!=freq[i]) return false;
        }
        return true;

    }
}