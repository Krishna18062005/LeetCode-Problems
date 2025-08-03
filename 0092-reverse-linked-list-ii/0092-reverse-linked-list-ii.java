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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head == null || left == right) return head;

        int i = 1;
        ListNode ans = head;
        while(i<left-1 && head !=null)  {
            head = head.next;
            i++;
        }
        ListNode tt = head;
        ListNode lef = left==1 ? head : head.next;
       
        while(head != null && i<=right) { head = head.next;i++;}
        ListNode node = head;

        while(lef!=head){
            ListNode temp = lef.next;
            lef.next = node;
            node = lef;
            lef = temp;
        }
        if(left>1) tt.next = node;
        return left > 1 ? ans : node;
    }
}