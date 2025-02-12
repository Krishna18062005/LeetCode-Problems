/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    static TreeNode ans=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {       
        inorder(root,p,q);
        return ans;
    }
    public static void inorder(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){return;}
        inorder(root.left,p,q);
        if(p.val<=root.val&&root.val<=q.val||q.val<=root.val&&root.val<=p.val){
            ans= root;
            return;
        }
        inorder(root.right,p,q);        
        }
    }
