class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isp(i)){
                ls.add(i);
            }
        }
        int min=Integer.MAX_VALUE;
        int fn=-1;
        int sn=-1;
        for(int i=1;i<ls.size();i++){
            if(min>Math.abs(ls.get(i)-ls.get(i-1))){
                fn=ls.get(i-1);
                sn=ls.get(i);
                min=Math.abs(fn-sn);
            }

        }
        int[] ans={fn,sn};
        return ans;

    }
    public static boolean isp(int a){
        if(a<=1)return false;
        if(a<=3) return true;
        if(a%2==0||a%3==0) return false;
        for(int i=4;i*i<=a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
}