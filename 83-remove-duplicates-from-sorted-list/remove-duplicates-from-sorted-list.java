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
        if (head == null || head.next == null) { // Check for empty or single-node list
            return head;
        }

        ListNode checker = head;
        ListNode current = head.next;

        while (current != null) {
            if (current.val == checker.val) {
                // Skip duplicate node
                checker.next = current.next;
                current = checker.next;
            } else {
                // Move both pointers forward
                checker = current;
                current = current.next;
            }
        }
        return head; // Return the modified list
    }
}