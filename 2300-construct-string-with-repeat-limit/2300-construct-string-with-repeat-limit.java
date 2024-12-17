class Solution {
    public String repeatLimitedString(String s, int rL) {
        int []fr=new int[26];
        for(int i=0;i<s.length();i++) fr[s.charAt(i)-'a']++;
        StringBuilder rs=new StringBuilder("");
        int c=0;
        int i=25;
        for(;i>=0;){
            if(fr[i]<=0){
                i--;
                continue;
            }
            int min=Math.min(rL,fr[i]);
            for(int j=0;j<min;j++){
                rs.append((char)(i+'a'));
            }
            fr[i]-=min;
            if(fr[i]>=1){
                int nsi=i-1;
                while(nsi>=0&&fr[nsi]==0) nsi--;
                if(nsi<0) break;
                rs.append((char)(nsi+'a'));
                fr[nsi]--;
                }
            }        
        return rs.toString();
    }
}
