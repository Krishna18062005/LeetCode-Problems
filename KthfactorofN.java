class Solution {
    public int kthFactor(int n, int k) {
    int c=0;
    int i=0;
    while(i<=n&&c<=n&&c<k){
        i++;
       if(n%i==0){
        c++;
       }
       
    }
return (i<=n)?i:-1;
    }
    
}
