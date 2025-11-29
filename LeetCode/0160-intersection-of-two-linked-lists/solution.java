/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int length1=0;
        int length2=0;
        while(temp1!=null)
        {
            length1++;
            temp1=temp1.next;
        }

        while(temp2!=null)
        {
            length2++;
            temp2=temp2.next;
        }

        temp1=headA;
        temp2=headB;
        if(length1>length2)
        {
            int steps=length1-length2;
            for(int i=1;i<=steps;i++)
            {
                temp1=temp1.next;
            }
        }

        else
        {
            int steps=length2-length1;
            for(int i=1;i<=steps;i++)
            {
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
