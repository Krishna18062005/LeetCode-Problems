class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;

        int prev = colors[0];
        int size = 1;
        int ans = 0;
        for(int i = 1; i < (n + k - 1); ++i)
        {
            int curr = colors[i%n];
            if((curr ^ prev) == 1)
            {
                size++;
            }
            else{
                size = 1;
            }

            if(size >= k)
            {
                ans++;
            }

            prev = curr;
        }

        return ans;
    }
}