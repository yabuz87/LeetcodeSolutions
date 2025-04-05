/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        {
            return false;
        }
       
        ListNode highSpeedptr=head;
        ListNode lowspeedptr=head;

        while(highSpeedptr != null && highSpeedptr.next != null)
        {
            highSpeedptr=highSpeedptr.next.next;
            lowspeedptr=lowspeedptr.next;
            if(highSpeedptr==lowspeedptr)
            return true;
        }
        return false;

    }
}