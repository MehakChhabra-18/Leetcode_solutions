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
    public ListNode deleteMiddle(ListNode head) {

        // If only 1 node → after deletion list becomes empty
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode curr = head; // used to count
        int count = 0;

        // Counting nodes
        while(curr != null) {
            count++;
            curr = curr.next;
        }

        // Reset pointers
        slow = head;
        fast = head;
        curr = null;  // curr will act as "previous of slow"

        // EVEN length
        if(count % 2 == 0)
        {
            while(fast != null && fast.next != null)
            {
                curr = slow;         // store previous
                slow = slow.next;     // move slow
                fast = fast.next.next; // move fast
            }

            // slow is middle → delete it using curr
            curr.next = slow.next;
            return head;
        }

        // ODD length
        else
        {
            while(fast != null && fast.next != null)
            {
                curr = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            curr.next = slow.next;
            return head;
        }
    }
}

