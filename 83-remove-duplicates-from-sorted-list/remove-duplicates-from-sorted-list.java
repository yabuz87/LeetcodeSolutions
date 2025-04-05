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
           
            if(head==null || head.next==null)
            {
                return head;
            }
             ListNode checker=head;
            ListNode current=head.next;
        while(current!=null)
        {
            if(current.val==checker.val)
            {
                
                checker.next=current.next;
                current=checker.next;
            }
           else 
           {
             checker=current;
            current=current.next;
           }
        }
        return head;
    }
}