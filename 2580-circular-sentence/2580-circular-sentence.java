class Solution {
    public boolean isCircularSentence(String sentence) {
        String arr[]=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(arr[i].length()-1)!=arr[(i+1)%arr.length].charAt(0))
            return false;
        }
        return true;
    }
}