class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int c=nums1[i];
            int pos=0;
            for(int j=0;j<nums2.length;j++){
                if(c==nums2[j]){
                    pos=j;
                    break;
                }
            }
            int val=-1;
            for(int j=pos;j<nums2.length;j++){
                if(c<nums2[j]){
                    val=nums2[j];
                    break;
                }

            }
            ans[i]=val;
        }
        return ans;
    }
}