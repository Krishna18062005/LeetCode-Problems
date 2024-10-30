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
    List<Integer> ar=new ArrayList<>();
    public List<Integer> isValidBST(TreeNode root,List<Integer> ar) {
        if(root!=null) {
        isValidBST(root.left,ar);
        ar.add(root.val);
        isValidBST(root.right,ar);
        }
        return ar;
    }
    public boolean isValidBST(TreeNode root){
        isValidBST(root,ar);
        
        for (int i=1;i<ar.size();i++){
            if(ar.get(i-1)>=ar.get(i)) return false;
            
        }
        return true;
    }
}