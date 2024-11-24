class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        int d=s.length()/k;
        if(s.equals(t)) return true;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i+=d){
            String req=s.substring(i,i+d);
            if(map.containsKey(req)){
                map.put(req,map.get(req)+1);
            }
            else
            map.put(s.substring(i,i+d),1);
        }
        for(int i=0;i<t.length();i+=d){
            String tar=t.substring(i,i+d);
            if(!map.containsKey(tar)) return false;
            else if(map.get(tar)<1) return false;
            else{
                map.put(tar,map.get(tar)-1);
            }
        }
        return true;
    }
}