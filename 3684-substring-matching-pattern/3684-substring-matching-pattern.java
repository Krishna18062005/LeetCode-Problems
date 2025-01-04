import java.util.regex.Pattern;
class Solution {
    public boolean hasMatch(String s, String p) {
        String[] parts = p.split("\\*", 2);
        String pre = parts[0];
        String suf = parts[1];
        if(!s.contains(pre)) return false;
        if(!s.contains(suf)) return false;
        int i=s.indexOf(pre);
        int j=s.indexOf(suf,i+pre.length());
        if(suf.equals("")) i=0;
        if(pre.equals("")) j=0;
        if(i==-1||j==-1) return false;
        return true;
        
    }
}