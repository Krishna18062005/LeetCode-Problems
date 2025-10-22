// class Solution {
//     public int longestBalanced(String s) {
        
//         int ans=0;
//         int n=s.length();
//         if(n==1) return 1;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(help(s,i,j)){
//                     ans=Math.max(ans,j-i+1);
//                 }
//             }
//         }
//         return ans;

//     }
//     boolean help(String s,int st,int en){
//         int[] freq=new int[26];
//         for(int p=st;p<=en;p++){
//             freq[s.charAt(p)-'a']++;
//         }
//         int n=0;
//         for(int i:freq){
//             if(i!=0) n=i;
//         }
//         for(int i:freq){
//             if(i!=0){
//                 if(i!=n) return false;
//             }
//         }
//         return true;
//     }

// }


class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int k = 0; 
            int max = 0; 
            for (int j = i; j < n; j++) {
                int val = s.charAt(j) - 'a';
                if (++freq[val] == 1)
                    k++; 
                max = Math.max(max, freq[val]);

                
                if (max * k == j - i + 1)
                    ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}