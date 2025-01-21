class Solution {
    public boolean isPerfectSquare(int num) {
        int i=(int)Math.sqrt(num);
            if(i*i==num){
                return true;
            }
        
        return false;
    }
}