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
            map.put(req,1);
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
        // int d=s.length()/k;
        // String sA[]=new String[k];
        // String tA[]=new String[k];
        // int ind=0;
        // for(int i=0;i<s.length();i+=d){
        //     sA[ind]=s.substring(i,i+d);
        //     tA[ind]=t.substring(i,i+d);
        //     ++ind;
        // }
        // Arrays.sort(sA);
        // Arrays.sort(tA);
        // return Arrays.equals(sA,tA);
    }
}