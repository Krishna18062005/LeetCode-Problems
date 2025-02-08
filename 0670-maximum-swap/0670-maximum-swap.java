class Solution {
    public int maximumSwap(int num) {
        int max=num;
        char[] nu=(num+"").toCharArray();
        for(int i=0;i<nu.length;i++){
            for(int j=i+1;j<nu.length;j++){
                char t=nu[i];
                nu[i]=nu[j];
                nu[j]=t;
                int numb=Integer.parseInt(new String(nu));
                max=Math.max(numb,max);
                t=nu[i];
                nu[i]=nu[j];
                nu[j]=t;

            }
            
            
        }
        return max;

    }
}