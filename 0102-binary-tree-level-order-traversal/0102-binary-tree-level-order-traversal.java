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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        if(root==null) return ans;
        que.add(root);
        while(!que.isEmpty()){
            List<Integer> ls=new ArrayList<>();
            int n=que.size();
            while(n-->0){
                if(que.peek().left!=null) que.add(que.peek().left);
                if(que.peek().right!=null) que.add(que.peek().right);
                ls.add(que.poll().val);
            }
            ans.add(ls); 
        }
        return ans;
    }
}