class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean []arr=new boolean[n];
        if(n<=2) return 0; 
        arr[2]=true;
        for(int i=3;i<=n;i+=2) arr[i]=true;
        for(int i=2;i<n;i++){
            if(arr[i]){
                c++;
              // System.out.println(""+i);
                for(int j=1;j*i<n;j++){
                    arr[j*i]=false;
                    
                            }
                                        }
        }
        
        return c;
    }
    }