class Solution {
    public boolean isBalanced(String num) {
        int os=0;
        int es=0;
        for(int i=0;i<num.length();i+=2){
            os+=(num.charAt(i))-'0';
            if(i!=num.length()-1)
            es+=num.charAt(i+1)-'0';
        }
        return os==es;
    }
}