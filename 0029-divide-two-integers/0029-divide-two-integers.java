class Solution {
    public int divide(int dd, int dr) {
        if(dd==Integer.MIN_VALUE&&dr==-1){
            return dd-1;
        }
        
        
        return dd/dr;
    }
}