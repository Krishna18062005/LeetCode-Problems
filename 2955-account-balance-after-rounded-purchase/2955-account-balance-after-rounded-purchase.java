class Solution {
    public int accountBalanceAfterPurchase(int p) {
        if(p%10==0){
            return 100-p;
        }
        if(p%10<=4) return 100-(10*(p/10));
        p+=(10-(p%10));
        return 100-p;
    }
}