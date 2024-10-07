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
    public ListNode middleNode(ListNode head) {
        int counter = 0;
        ListNode node = head;
        
        // First pass to count the number of nodes
        while (head != null) {
            head = head.next;
            counter++;
        }
        
        // Calculate the middle index
        counter = counter / 2;
        
        // Second pass to reach the middle node
        for (int i = 0; i < counter; i++) {
            node = node.next;
        }
        
        return node;
    }
}
