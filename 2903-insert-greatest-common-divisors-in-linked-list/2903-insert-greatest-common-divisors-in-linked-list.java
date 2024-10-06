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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode tem=head;
        ListNode tem2=head.next;
        while(tem.next!=null){
            ListNode gcd=new ListNode(gC(tem.val,tem.next.val));
            tem.next=gcd;
            gcd.next=tem2;
            tem=tem2;
            tem2=tem2.next;

        }
        return head;
    }
    public static int gC(int a,int b){
        if(b==0){
            return a;
        }
        return gC(b,a%b);
    } 
}