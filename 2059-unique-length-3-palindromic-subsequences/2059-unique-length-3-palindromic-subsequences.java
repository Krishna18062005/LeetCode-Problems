class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<String> set=new HashSet<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
           }
           else{
            map.put(s.charAt(i),1);
           }

        }
        
        for(char key:map.keySet()){
            if(map.get(key)>=3) set.add(""+key+key+key);
            if(map.get(key)>=2){
        for(int i=0;i<s.length();i++){
            if(key!=s.charAt(i))
           set.add(""+key+s.charAt(i)+key); 
        }}}
        int c=0;
        for(String i:set){
            if(crct(i,s)) {c++;}
        }
        return c;
    }
    static boolean crct(String st,String s){
        int ind1=s.indexOf(st.charAt(0)+"");
        int ind2=s.indexOf(st.charAt(1)+"",ind1);
        int ind3=s.indexOf(st.charAt(2)+"",ind2);
        if(ind3==-1||ind2==-1) return false;
        return true;
    }
}