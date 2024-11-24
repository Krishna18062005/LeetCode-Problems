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
 import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> a=new LinkedList<>();
        for(ListNode l:lists){
            while(l!=null){
                a.add(l.val);
                l=l.next;
            }
        }
        Collections.sort(a);
        ListNode ans=new ListNode(0);
        ListNode re=ans;
        for(int i:a){
            ans.next=new ListNode(i);
            ans=ans.next;
        }
        return re.next;

    }
}