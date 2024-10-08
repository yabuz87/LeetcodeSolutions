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
    //     int counter = 0;
    //     ListNode node = head;
        
    //     // First pass to count the number of nodes
    //     while (head != null) {
    //         head = head.next;
    //         counter++;
    //     }
        
    //     // Calculate the middle index
    //     counter = counter / 2;
        
    //     // Second pass to reach the middle node
    //     for (int i = 0; i < counter; i++) {
    //         node = node.next;
    //     }
        
    //     return node;


    // }

    ListNode middle=head;
    ListNode end=head;
    while(end!=null && end.next!=null)
    {
        middle=middle.next;
        end=end.next.next;
    }
    return middle;
    // the above code is written after i watched a video. the code does not improve the time or the space complexity but it is clearer code than the above one. gott?
    }
}
