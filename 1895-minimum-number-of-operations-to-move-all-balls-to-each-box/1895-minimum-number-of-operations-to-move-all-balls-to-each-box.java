
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];


        int leftBalls=0, leftDis=0, rightBalls=0, rightDis=0;
        for(int i=n-1 ; i>=0 ; i--){
            rightDis += rightBalls;
            rightBalls += ((boxes.charAt(i) == '1' ? 1 : 0));
        }

        for(int i=0 ; i<n ; i++){
               leftDis += leftBalls;
            leftBalls += ((boxes.charAt(i) == '1') ? 1 : 0);

             ans[i] = leftDis+rightDis;

              rightBalls -= ((boxes.charAt(i) == '1') ? 1 : 0);
            rightDis -= rightBalls;
        }

        return ans;
    }
}