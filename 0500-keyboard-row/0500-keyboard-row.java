class Solution {
    public String[] findWords(String[] words) {
        
        int c=0;
        ArrayList<String> arr=new ArrayList<>();
        for(String i:words){
            
            if(sameRow(i.toLowerCase())) arr.add(i);
        }
        String ans[]=new String[arr.size()];
        for(int i=0;i<arr.size();i++) ans[i]=arr.get(i);
        return ans;
    }
    private static boolean sameRow(String k){
        String first="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";
        int r1=0,r2=0,r3=0;
        for(int i=0;i<k.length();i++){
            char ch=k.charAt(i);
            if(first.indexOf(ch)!=-1) r1++;
            if(second.indexOf(ch)!=-1) r2++;
            if(third.indexOf(ch)!=-1) r3++;

    
        }
        return r1==k.length()||r2==k.length()||r3==k.length();

    }
}