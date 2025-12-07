class Solution {
    public boolean completePrime(int num) {
        if(num<2) return false;
        String n=num+"";
        int f=2;
        for(int i=0;i<n.length();i++){
            if(i!=0)
            f=Integer.parseInt(n.substring(0,i));
            int b=Integer.parseInt(n.substring(i));
            if(isp(f)||isp(b)) return false;
        }
        return true;
    }
    private static boolean isp(int n){
        if(n<2) return true;
        if(n<=3) return false;
        if(n%2==0||n%3==0) return true;
        for(int i=4;i*i<=n;i++){
            if(n%i==0) return true;
        }
        return false;
    }
}