class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0) {s+=i;s+=(num/i);}
        }
        s-=num;
        return s==num&&num!=1;
    }
}