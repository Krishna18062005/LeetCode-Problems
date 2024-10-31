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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode ans=head;
        while(head!=null&&head.next!=null){
            int tmp=head.next.val;
            head.next.val=head.val;
            head.val=tmp;
            head=head.next.next;

        }
        return ans;
    }
}