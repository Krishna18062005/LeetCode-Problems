class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        int n1=str1.length();
        int n2=str2.length();
        while(i<n1&&j<n2){
            if(str1.charAt(i)==str2.charAt(j)||str1.charAt(i)+1==str2.charAt(j)){
                j++;
            }
           else if(str1.charAt(i)=='z'&&str2.charAt(j)=='a') j++;
            i++;
            if(i==n1&&j!=n2) return false;
            if(j==n2) return true;

        }
        return true;
    }
}