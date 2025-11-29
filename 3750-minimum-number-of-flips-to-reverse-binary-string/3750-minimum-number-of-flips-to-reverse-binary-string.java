class Solution {
    public int minimumFlips(int n) {
        String bin=Integer.toBinaryString(n);
        int c=0;
        int i=0;
        int j=bin.length()-1;

        while(i<j&&j>0){
          if(bin.charAt(i)!=bin.charAt(j)) c+=2;i++;j--;
        }
        return c;
    }
}