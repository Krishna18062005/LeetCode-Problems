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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ans=new ListNode(0);
        ListNode answe=ans;
        ListNode dup=head;
        while(dup!=null){
            if(dup.next!=null&&dup.val==dup.next.val){
                while(dup.next!=null&&dup.val==dup.next.val){
                    dup=dup.next;
                }
                dup=dup.next;
            }
            else{
                ans.next=dup;
                ans=ans.next;
                dup=dup.next;
                ans.next = null;
            }
            
            
        }
        return answe.next;
    }
}



