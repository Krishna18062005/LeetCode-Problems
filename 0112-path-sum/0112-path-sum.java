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
    ArrayList<Integer> res = new ArrayList<>();

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        helper(root, 0);

        for (int i : res)
            if (i == targetSum)
                return true;
        return false;
    }

    void helper(TreeNode root, int s) {
        if (root == null)
            return;
        s += root.val;
        if (root.right == null && root.left == null) {
            res.add(s);
            ;
            return;
        }

        helper(root.left, s);
        helper(root.right, s);
    }
}