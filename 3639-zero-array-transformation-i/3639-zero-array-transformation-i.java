// class Solution {
//     public boolean isZeroArray(int[] nums, int[][] queries) {
//         for(int[] q:queries){
//             for(int i=q[0];i<=q[1];i++) nums[i]--;
//         }
//         for(int i:nums) if(i>0) return false;
//         return true;
//     }
// }
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1]; 

      
        for (int[] q : queries) {
            diff[q[0]]--;
            diff[q[1] + 1]++; 
        }

        
        int current = 0;
        for (int i = 0; i < n; i++) {
            current += diff[i]; 
            nums[i] += current;
            if(nums[i]>0){
                return false;
            }
        }

        return true;
    }
}

