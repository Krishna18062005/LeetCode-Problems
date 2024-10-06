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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
         ListNode odd=new ListNode(0);

         ListNode even=new ListNode(0);
         ListNode kp=even;
         ListNode ans=odd;
         int i=1;
         while(head!=null){
            if(i%2==0){
                even.next=new ListNode(head.val);
                even=even.next;
            }
            else{
                odd.next=new ListNode(head.val);
                odd=odd.next;
            }
            i++;
            head=head.next;
         }
         odd.next=kp.next;
         return ans.next;

    }
}