class Solution {

    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int min=Integer.MAX_VALUE;
        int c=0;
        for(int[] rows:matrix){
            for(int i:rows){
                sum+=Math.abs(i);
                if(i<0){
                    c++;}
                    min=Math.min(Math.abs(i),min);
                
                
            }
        }
        if(c%2==1) sum-=2*min;
        return sum;

    }
}