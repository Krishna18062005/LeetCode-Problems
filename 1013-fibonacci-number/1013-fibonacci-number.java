class Solution {
    
    public int fib(int n) {

        //iterative approach
        // if(n<=1) return n;
        // int a=0;
        // int b=1;
        // int c;
        // for(int i=2;i<=n;i++){
        //     c=a+b;
        //     a=b;
        //     b=c;
        // }
        // return b;

        //recursive approach;
        if(n<=1) return n;
        return fib(n-2)+fib(n-1);
        
    }
}