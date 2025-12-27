class Solution {
    public int[] findEvenNumbers(int[] digits) {
       Set<Integer> ls=new HashSet<>();
       int n=digits.length;
       for(int i=0;i<n;i++){
        if(digits[i]!=0)
        for(int j=0;j<n;j++){
            
            if(i!=j)
            for(int k=0;k<n;k++){
                if(j!=k&&i!=k)
                if(digits[k]%2==0){                    
                    ls.add((digits[i]*100)+(digits[j]*10)+digits[k]);
                }

            }
        }

       }
       
       int[] ans=new int[ls.size()];
       int ind=0;
       for(int i:ls){
        ans[ind++]=i;
       }
       Arrays.sort(ans);
       return ans;
    }
}