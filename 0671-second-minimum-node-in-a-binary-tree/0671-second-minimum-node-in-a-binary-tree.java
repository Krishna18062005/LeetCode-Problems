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
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
        help(pq,root);
        int k=pq.poll();
        if(pq.size()==0){
                return -1;
            }
        int ans=pq.poll();
        while(ans==k){
            if(pq.size()==0){
                return -1;
            }
            ans=pq.poll();
        }
        return ans;
    }
    public static void help(PriorityQueue<Integer> pq,TreeNode root){
        if(root==null) return;
        pq.offer(root.val);
        help(pq,root.right);
        help(pq,root.left); 
    }
}