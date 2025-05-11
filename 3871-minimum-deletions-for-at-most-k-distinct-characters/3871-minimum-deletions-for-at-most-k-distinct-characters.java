class Solution {
    public int minDeletion(String s, int k) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int ans=0;
        List<Integer> an=new ArrayList<>();
        
        for(int i:freq){
            if(i!=0) an.add(i);
        }
        if(k>=an.size()) return 0;
     
        int l=0;
        while(an.size()!=l+k){
            ans+=an.get(l);
            l++;
        }
        return ans;
    }
}