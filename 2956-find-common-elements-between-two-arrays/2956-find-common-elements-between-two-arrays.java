class Solution {
    public int[] findIntersectionValues(int[] n1, int[] n2) {
        int c1=0;
        int c2=0;
        for(int i:n1){
            for(int j:n2){
                if(i==j) {c1++;break;}
            }
        }
        for(int i:n2){
            for(int j:n1){
                if(i==j){ c2++;break;}
            }
        }
        return new int[]{c1,c2};
    }
}