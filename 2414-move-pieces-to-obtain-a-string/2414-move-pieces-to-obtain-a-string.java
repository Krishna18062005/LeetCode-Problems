class Solution {
    public boolean canChange(String start, String target) {
        char[] str = start.toCharArray();
        char[] tar = target.toCharArray();
        int lc = 0, rc = 0;
        for(int i=0; i<str.length; i++) {
            if(tar[i]=='L') {
                if(rc == 0)
                    lc++;
                else 
                    return false;
            }
            if(str[i] == 'R') {
                if(lc == 0)
                    rc++;
                else 
                    return false;
            }
            if(str[i]=='L') {
                if(lc > 0)
                    lc--;
                else 
                    return false;
            }
            if(tar[i] == 'R') {
                if(rc > 0)
                    rc--;
                else 
                    return false;
            }

        }
        return lc == 0 && rc == 0;
    }
}