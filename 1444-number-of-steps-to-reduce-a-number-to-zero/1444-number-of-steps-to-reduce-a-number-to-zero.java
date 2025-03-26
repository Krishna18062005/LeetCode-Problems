class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0){
            c++;
            if(num%2==0){
                num/=2;
            }
            else{
                num-=1;
            }
        }
        return c;
    }
}