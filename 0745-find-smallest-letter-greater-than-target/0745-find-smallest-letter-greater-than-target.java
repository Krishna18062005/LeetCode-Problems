class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0,j=letters.length-1;
        char ans=' ';
        while(i<=j){
            int mid=(i+j)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans==' '?letters[0]:ans;
    }
}