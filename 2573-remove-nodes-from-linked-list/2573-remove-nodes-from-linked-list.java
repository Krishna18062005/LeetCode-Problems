class Solution {
    public ListNode removeNodes(ListNode head) {
        //reverse
        ListNode prev= null ; 
        ListNode current = head ; 
        while(current != null){
            ListNode temp = current.next ;
            current.next = prev ; 
            prev = current ; 
            current = temp ;
        }
        ListNode neww= new ListNode(prev.val) ;
        int maxi = neww.val ;
        current = prev.next ; 
        while(current!=null){
            if(current.val >= maxi){
                ListNode temp= new ListNode(current.val);
                temp.next = neww ; 
                neww = temp ; 
                maxi = temp.val ; 

            }
            current = current.next ;

        }
        return neww;
    }
}