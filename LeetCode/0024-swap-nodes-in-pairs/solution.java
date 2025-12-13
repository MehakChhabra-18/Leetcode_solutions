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
        ListNode curr=head;
        int length=0;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        if(length<2) return head;
        int k=2;
        ListNode prev=null;
        ListNode next=null;
        curr=head;
        int count=0;
        while(curr!=null && count<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
        {
            head.next=swapPairs(next);
        }

        return prev;

    }
}
