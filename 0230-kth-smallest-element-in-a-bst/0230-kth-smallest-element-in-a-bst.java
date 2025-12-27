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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> in = new ArrayList<>();
        help(root, in);

        return in.get(k - 1);
    }

    public static void help(TreeNode root, ArrayList<Integer> in) {
        if (root == null)
            return;
        help(root.left, in);
        in.add(root.val);
        help(root.right, in);
    }
}