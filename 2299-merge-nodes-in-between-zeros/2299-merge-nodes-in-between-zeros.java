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
    public ListNode mergeNodes(ListNode head) {
        //ListNode an=head;
        ListNode ans=new ListNode(0);
        ListNode reta=ans;
        int s=0;
        while(head!=null){
            if(head.val==0) {
                ans.next=new ListNode(s);
                ans=ans.next;
                s=0;
                head=head.next;}
            else{
                s+=head.val;
                head=head.next;
            }


        }
        return reta.next.next;
    }
}