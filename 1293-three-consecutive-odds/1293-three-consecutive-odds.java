class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            c=(arr[i]%2==1)?c+=1:0;
            if(c==3)    return true;
        }
        return false;
    }
}