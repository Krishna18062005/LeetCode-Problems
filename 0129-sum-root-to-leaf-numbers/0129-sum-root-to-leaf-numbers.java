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
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> ar=new ArrayList<>();
        int n=0;
        help(root,ar,n);
        int s=0;

        for(int i:ar) s+=i;
        return s;
    }
    public static void help(TreeNode root,ArrayList<Integer> ar,int n){
        if(root==null) return;
        n=n*10+root.val;
        if(root.left==null&&root.right==null) ar.add(n);
        if(root.right!=null){
             help(root.right,ar,n);
        }
        if(root.left!=null){
            help(root.left,ar,n);
        }
    }
}