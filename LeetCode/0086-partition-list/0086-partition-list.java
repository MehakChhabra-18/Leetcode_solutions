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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead=null;
        ListNode smallTail=null;
        ListNode largeHead=null;
        ListNode largetail=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next = null;  
            if(curr.val<x)
            {
                if(smallHead==null)
                {
                    smallHead=smallTail=curr;
                }
                else
                {
                    smallTail.next=curr;
                    smallTail=curr;
                }
            }

            else
            {
                if(largeHead==null)
                {
                    largeHead=largetail=curr;
                }
                else
                {
                    largetail.next=curr;
                    largetail=curr;
                }
            }

            curr=next;
        }

        if(smallTail!=null)
        {
            smallTail.next=largeHead;
            return smallHead;
        }

        return largeHead;
        
    }
}