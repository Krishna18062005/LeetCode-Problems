class Solution {
    public int maxScore(String s) {
        int max=0;
        for(int i=1;i<s.length();i++){
            int zc=COUNT(s.substring(0,i),'0');
            int oc=COUNT(s.substring(i),'1');
            max=Math.max(zc+oc,max);
        }
        return max;
    }
    static int COUNT(String st,char key){
        int c=0;
        for(char i:st.toCharArray()){
            if(i==key) c++;
        }
        return c;
    }
}