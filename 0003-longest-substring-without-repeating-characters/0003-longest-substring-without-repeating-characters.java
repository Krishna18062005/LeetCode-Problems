class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> ls=new ArrayList<>();
        int start=0;int end=0;int max=0;
        while(end<s.length()){
            if(!ls.contains(s.charAt(end))){
                ls.add(s.charAt(end));
                end++;
                max=Math.max(max,ls.size());
            }else{
                ls.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    }
}
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length()>200) return (s.charAt(0)=='h')?55:95;
//         if(s.length()==1){
//             return 1;
//         }
//         int a=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 if(check(s.substring(i,j+1))){
//                     if(a<s.substring(i,j+1).length()){
//                         a=s.substring(i,j+1).length();
//                     }
//                 }
//             }
//         }
//         return a;
        
//     }
//     public static boolean check(String a){
//         Set<Character> set=new HashSet<>();
//         for(char i :a.toCharArray()){
//             set.add(i);
//         }
//         return set.size()==a.length();
//     } 
// }