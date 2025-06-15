// class Solution {
//     public int maxDiff(int num) {
//         int max=num;
//         int min=num;
//         for(char i=49;i<58;i++){
//             for(char j=49;j<58;j++){
//                 String n=(Integer.toString(num).replace(i,j));
//                 if(n.charAt(0)!='0'){
//                     int nu=Integer.parseInt(n);
//                 max=Math.max(max,nu);
//                 min=Math.min(min,nu);
                
//             }}
//         }
//         System.out.println(max+" "+min);
//         return max-min;
//     }
// }


class Solution {

    public int maxDiff(int num) {
        int min_num = num;
        int max_num = num;
        for (int x = 0; x < 10; ++x) {
            for (int y = 0; y < 10; ++y) {
                String res = change(num, x, y);
                // Check if there are leading zeros
                if (res.charAt(0) != '0') {
                    int res_i = Integer.parseInt(res);
                    min_num = Math.min(min_num, res_i);
                    max_num = Math.max(max_num, res_i);
                }
            }
        }

        return max_num - min_num;
    }

    public String change(int num, int x, int y) {
        x+=48;
        y+=48;
        char x1=(char)x;
        char y1=(char)y;
        String n=(num+"").replace(x1,y1);
        return n;
    }
}