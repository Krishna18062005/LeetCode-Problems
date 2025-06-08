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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode ref=ans;
        while(l1!=null&&l2!=null){
            int s=l1.val+l2.val+carry;
            l1=l1.next;
            l2=l2.next;
            carry=s/10;
            ref.next=new ListNode(s%10);
            ref=ref.next;
        }
        while(l1!=null)
        {
            int s=carry+l1.val;
            l1=l1.next;
            carry=s/10;
            ref.next=new ListNode(s%10);
            ref=ref.next;

        }
        while(l2!=null){
             int s=carry+l2.val;
            l2=l2.next;
            carry=s/10;
            ref.next=new ListNode(s%10);
            ref=ref.next;
        }
        if(carry!=0){
            ref.next=new ListNode(carry);
        }
        return ans.next;
    }
}