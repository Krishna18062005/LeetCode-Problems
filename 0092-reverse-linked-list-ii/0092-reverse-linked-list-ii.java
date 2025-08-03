
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

       
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode nodeBeforeLeft = dummy;
        for (int i = 0; i < left - 1; i++) {
            nodeBeforeLeft = nodeBeforeLeft.next;
        }

        ListNode sublistTail = nodeBeforeLeft.next;
        ListNode prev = null, curr = sublistTail;

        for (int i = 0; i <= right - left; i++) {
            ListNode nextNode = curr.next; //Save next
            curr.next = prev; // Reverse link
            prev = curr; //Move prev
            curr = nextNode; //Move curr
        }

        // \U0001f517 Step 3: Reconnect reversed sublist
        nodeBeforeLeft.next = prev; // Connect start of reversed part
        sublistTail.next = curr; // Connect end of reversed part

       
        return dummy.next;
    }
}