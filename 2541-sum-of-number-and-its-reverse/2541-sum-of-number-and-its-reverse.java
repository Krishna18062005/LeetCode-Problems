class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        for(int i=0;i<=num;i++){
            if(i+rev(i)==num) return true;
        }return false;
    }
    int rev(int a){
        int ans=0;
        while(a>0){
            ans=ans*10+a%10;
            a/=10;
        }
        return ans;
    }
}