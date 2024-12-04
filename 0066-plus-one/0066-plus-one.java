class Solution {
    public int[] plusOne(int[] digits) {
        boolean ans=true;
        for(int i:digits){
            if(i!=9) ans=false;
        }
        if(ans){
            int[] anss=new int[digits.length+1];
            anss[0]=1;
            return anss;
        }
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=1;
            if(digits[i]<10) return digits;
            digits[i]=0;
        }
        
        return digits;
    }
}