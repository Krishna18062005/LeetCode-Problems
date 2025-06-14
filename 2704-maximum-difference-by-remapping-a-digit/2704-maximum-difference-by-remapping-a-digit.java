class Solution {
    public int minMaxDifference(int num) {
        String s = "" + num;
        int max = 0;
        int i = 0;

         while (i < s.length() && s.charAt(i) == '9') {
            i++;
        }
        if (i < s.length()) {
            s = s.replace(s.charAt(i) , '9');
            max = Integer.parseInt(s);
        }
        else
        max=num;
        s=num+"";
        char ch = s.charAt(0);
        int min = Integer.parseInt(s.replace(ch , '0'));
       
        return max - min;

    }
}