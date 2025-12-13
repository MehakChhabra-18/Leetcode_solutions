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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode curr=head;
        int length=1;
        while(curr.next!=null)
        {
            length++;
            curr=curr.next;
        }
        ListNode tail=curr;
        k=k%length;
        if(k==0) return head;
        curr=head;
        for(int i=1;i<length-k;i++)
        {
            curr=curr.next;
        }
        ListNode newHead=curr.next;
        curr.next=null;
        tail.next=head;
        head=newHead;
        return head;

    }
}
