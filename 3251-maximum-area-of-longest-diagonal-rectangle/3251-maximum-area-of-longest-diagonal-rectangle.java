class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double d = 0;
        for(int i=0; i<dimensions.length; i++){
            int h = dimensions[i][0];
            int b = dimensions[i][1];
            double diagonal = Math.sqrt((long)(h*h) + (long)(b*b));
            if(d < diagonal || (diagonal == d && h * b > maxArea)){
                d = diagonal;
                maxArea = h*b;
            }
        }
        return maxArea;
    }
}