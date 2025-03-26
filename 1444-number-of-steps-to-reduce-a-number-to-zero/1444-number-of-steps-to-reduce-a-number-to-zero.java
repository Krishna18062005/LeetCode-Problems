class Solution {
    public int numberOfSteps(int num) {
        if(num==0) return num;
        int c=0;
        while(num!=0){
            c++;
            c+=(num&1);
            num>>=1;
        }
        return c-1;
    }
}