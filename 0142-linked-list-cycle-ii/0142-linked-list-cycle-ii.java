/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode sl=head;
        ListNode fa=head;
        while(fa!=null&&fa.next!=null){
            sl=sl.next;
            fa=fa.next.next;
            if(sl==fa) break;
        }
        if(fa==null||fa.next==null) return null;
        fa=head;
        while(fa!=sl){
            sl=sl.next;
            fa=fa.next;
        }
        return sl;
    }
}