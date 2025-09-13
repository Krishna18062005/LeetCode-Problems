/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int cc=0;
    public int sumOfLeftLeaves(TreeNode root) {
        
         cc=0;
        fxn(root, 1);

        return cc;
    }

    public static void fxn(TreeNode root, int f) {
        if (root.left == null && root.right == null) {
            if (f == 0)
                cc += root.val;
            return;
        } else if (root.left != null && root.right != null) {
            fxn(root.left, 0);
            fxn(root.right, 1);
        } else if (root.left != null)
            fxn(root.left, 0);
        else if(root.right!=null)
            fxn(root.right, 1);
    }

}