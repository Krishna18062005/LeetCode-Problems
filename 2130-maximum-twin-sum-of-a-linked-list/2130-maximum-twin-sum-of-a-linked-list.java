/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        if(head==null) return -1;
        int f=head.val;
        ArrayList<Integer> ls=new ArrayList<>();
        while(head!=null){
             ls.add(head.val);
             head=head.next;
        }
        int ans=f+ls.get(ls.size()-1);
        for(int i=0;i<ls.size()/2;i++){
            ans=Math.max(ls.get(i)+ls.get(ls.size()-i-1),ans);
        }
        return ans;
    }
}