class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vo=new ArrayList<>();
        String vowel="aeiouAEIOU";
        for(int i=0;i<s.length();i++) if(vowel.indexOf(s.charAt(i))!=-1) vo.add(s.charAt(i));
        Collections.sort(vo);
        StringBuilder ans=new StringBuilder("");
        int ind=0;
         for(int i=0;i<s.length();i++) {if(vowel.indexOf(s.charAt(i))!=-1) ans.append(vo.get(ind++));
         else{
            ans.append(s.charAt(i));
         }
         }
        return ans.toString();

    }
}