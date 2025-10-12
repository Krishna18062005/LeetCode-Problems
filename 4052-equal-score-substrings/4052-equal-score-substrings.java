class Solution {
    public boolean scoreBalance(String s) {
        int ts=0;
        for(char i:s.toCharArray()){
            ts+=(int)i-96;
        }
        int ls=0;
        for(char i:s.toCharArray()){
            ls+=(int)i-96;
            if(ls==ts-ls){
                return true;
            }

        }
        return false;

    }
}