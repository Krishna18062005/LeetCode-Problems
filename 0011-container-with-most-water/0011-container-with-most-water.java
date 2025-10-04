class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            ans=Math.max((r-l)*Math.min(height[l],height[r]),ans);
            //System.out.println();
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return ans;
    }
}