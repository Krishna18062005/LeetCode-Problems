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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head.next==null&&n==1) return null;
        int len=0;
        ListNode tmp=head;
         ListNode tp=tmp;
         while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        tmp=head;
        int req=len-n;
        if(req==0) return tp.next;
        len=1;
        while(tmp.next!=null&&len!=req){
            tmp=tmp.next;
            len++;
        }        
        tmp.next=tmp.next.next;
        System.out.print(len);
        return tp;
    }
}