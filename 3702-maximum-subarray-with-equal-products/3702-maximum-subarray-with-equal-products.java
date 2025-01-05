class Solution {
    public int maxLength(int[] nums) {
        int l=0;
        for(int i=0;i+1<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(prod(nums,i,j)==gcd(nums,i,j)*lcm(nums,i,j)){
                    l=Math.max(j-i+1,l);
                }
            }
        }
        return l;
    }
    static int prod(int[] nums,int st,int en){
        int p=1;
        for(int i=st;i<=en;i++){
            p*=nums[i];
        }
        return p;
    }
    static int lcm(int[] nums,int st,int en){
        int lcm=nums[st];
        for(int i=st+1;i<=en;i++){
            lcm=Lcm(lcm,nums[i]);
        }
        return lcm;
    }
    static int Lcm(int a,int b){
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        for(int i=1;i<=b;i++){
            if(max*i%min==0) return max*i;
        }
        return -1;
    }
    static int gcd(int[] nums,int st,int en){
        int gcd=nums[st];
        for(int i=st;i<=en;i++){
            gcd=Gcd(gcd,nums[i]);
        }
        return gcd;
    }
    static int Gcd(int a,int b){
        if(a<b){
            int te=a;
            a=b;
            b=te;
        }
        if(b==0) return a;
        return Gcd(a%b,b);
    }
}