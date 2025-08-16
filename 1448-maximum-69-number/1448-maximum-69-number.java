class Solution {
    public int maximum69Number(int num) {
        int ans = 0;
        boolean c = true;
        int cp=num;
        num=0;
        while(cp!=0){
            num=num*10+cp%10;
            cp/=10;
        }        
        while (num != 0) {
            if (c && num % 10 == 6) {
                ans = ans * 10 + 9;
                c = false;
            } else {
                ans = ans * 10 + (num % 10);
            }
            num /= 10;

        }
        return ans;
    }
}