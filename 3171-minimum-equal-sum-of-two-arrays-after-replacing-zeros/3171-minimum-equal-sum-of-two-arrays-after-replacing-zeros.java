class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1 = 0;
        int z1 = 0;
        int z2 = 0;
        long s2 = 0;
        for (int i : nums1) {
            if (i == 0)
                z1++;
            else
                s1 += i;
        }
        for (int i : nums2) {
            if (i == 0)
                z2++;
            else
                s2 += i;
        }
        
        if ((z2 == 0&&s1+z1>s2+z2 || z1 == 0&&s2+z2>s1+z1))
            return -1;
        long ans = 0;
        
            ans = s1 + z1;

         if(ans<s2+z2) {
            ans = s2 + z2;
        }
        return ans;

    }
}