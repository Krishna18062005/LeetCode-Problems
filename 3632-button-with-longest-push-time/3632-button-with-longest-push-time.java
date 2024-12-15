class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max=events[0][1];
        int min=events[0][0];
        for(int i=1;i<events.length;i++){
            if(max<events[i][1]-events[i-1][1]){
                max=events[i][1]-events[i-1][1];
                min=events[i][0];
            }
            else if(max==events[i][1]-events[i-1][1]&&min>events[i][0]){
                max=events[i][1]-events[i-1][1];
                min=events[i][0];
            }
            
            
        }
        return min;
    }
}