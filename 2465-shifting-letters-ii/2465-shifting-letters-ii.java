class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int len=s.length();
        int[] frd=new int[len];
        
        for(int i[]:shifts){
            int st=i[0];
            int end=i[1];
            int dir=i[2];
            if(dir==1){
                for(int j=st;j<=end;j++)
                frd[j]++;
            }
            else{
                for(int j=st;j<=end;j++)
                frd[j]--;
            }
        }
       //System.out.println(Arrays.toString(frd));
        char[] as=s.toCharArray();
        for(int i=0;i<len;i++){
            as[i]=(char)((((frd[i]+(as[i]-'a'))%26+26))%26+'a');
        }
        return new String(as);
    }
}