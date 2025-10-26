class Bank {
    long[] balance;

    public Bank(long[] balance) {
        this.balance=new long[balance.length];
        for(int i=0;i<balance.length;i++){
            this.balance[i]=balance[i];
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
         account1-=1;
         account2-=1;
        if(account1>=balance.length||account2>=balance.length) return false;
        if(balance[account1]>=money){
            balance[account1]-=money;
            balance[account2]+=money;
            return true;
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
         account-=1;
        if(account>=balance.length||account<0) return false;
        balance[account]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        account-=1;
        if(account>balance.length||account<0) return false;
        if(balance[account]<money) return false;
        balance[account]-=money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */