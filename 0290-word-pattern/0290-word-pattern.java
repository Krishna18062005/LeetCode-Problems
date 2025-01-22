class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> map=new HashMap<>();
        String[] ar=s.split(" ");
        if(ar.length!=pattern.length()) return false;
        Set<Character> st=new HashSet<>();
        for(int i=0;i<ar.length;i++){
            if(map.containsKey(ar[i])){
                if(pattern.charAt(i)!=map.get(ar[i])) return false;
            }
            else if(st.contains(pattern.charAt(i))){
                return false;
            }
            else{
                st.add(pattern.charAt(i));
                map.put(ar[i],pattern.charAt(i));
            }

        }
        return true;
    }
}