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
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to use as the new head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        // Loop through the list and swap pairs
        while (head != null && head.next != null) {
            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            
            // Swap the nodes
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            
            // Reposition pointers for the next pair
            prev = firstNode;
            head = firstNode.next;
        }
        
        // Return the new head
        return dummy.next;
    }
}
