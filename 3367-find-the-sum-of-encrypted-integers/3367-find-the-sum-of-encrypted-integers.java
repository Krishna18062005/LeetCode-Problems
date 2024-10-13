class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int s=0;
        for(int i:nums){
            
            s+=encrypt(i);
           // System.out.print(s);
        }
        return s;
    }
static int encrypt(int a){
    int m=0;
    int dc=0;
    while(a>0){
        dc++;
        m=Math.max(m,a%10);
        a/=10;
    }
    int l=m;
    for(int i=1;i<dc;i++){
       m=m*10+l;
       System.out.println(m);
    }
    return m;
}
}