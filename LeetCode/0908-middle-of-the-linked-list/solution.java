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
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }

        curr=head;
        ListNode fast =head;
        ListNode slow =head;
        if(count%2==0)
        {
          
            while(fast!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }

            return slow;
        }

        else
        {
            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        
    }
}
