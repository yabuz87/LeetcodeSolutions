
 
// public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current=head;
        int count=1;
        while(current.next!=null)
        {
            current=current.next;
            count++;

        }
        current=head;
        if(n==1)
        {
            if(current.next==null)
            return null;
                while(current.next.next!=null)
                {
                    current=current.next;
                }
                current.next=null;
                return head;
        }
       else if(n==count)
        {

            head=head.next;
            return head;
        }
        
        for(int i=1;i<count-n;i++)
        {
                current=current.next;
        }

       current.next=current.next.next;
        return head;
    }
}