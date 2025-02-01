class Solution {
    public String findValidPair(String s) {
        int[] fre=new int[10];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'0']++;
        }
        for(int i=1;i<s.length();i++){
            int fs=s.charAt(i-1);
            int sd=s.charAt(i);
            if(fs!=sd&&fre[fs-'0']==fs-'0'&&fre[sd-'0']==sd-'0'){
                return fs-'0'+""+(sd-'0');                
            }
        }
        return "";
    }
}