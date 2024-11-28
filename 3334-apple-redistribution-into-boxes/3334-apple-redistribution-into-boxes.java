class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int s=0;
        for(int i:apple) s+=i;
        int c=0;
        for(int i=capacity.length-1;i>=0;i--){

            if(s>0) c++;
            s-=capacity[i];

        }
        return c;
    }
}