class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<=9) {ans.add(i);continue;}
            int c=i;
            while(c!=0){
                int r=c%10;
                if(r==0) break;
                if(i%r!=0) break;
                c/=10;
            }
            if(c==0) ans.add(i);
        }
        return ans;
    }
}