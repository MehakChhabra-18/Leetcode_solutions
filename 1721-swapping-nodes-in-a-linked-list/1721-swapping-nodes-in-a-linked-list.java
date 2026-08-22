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
     public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode kthStart = head;

        for (int i = 1; i < k; i++) {
            kthStart = kthStart.next;
        }
        
        ListNode kthEnd=getKthFromEnd(head,k);

        int temp=kthStart.val;
        kthStart.val=kthEnd.val;
        kthEnd.val=temp;

        return head;
    }
}