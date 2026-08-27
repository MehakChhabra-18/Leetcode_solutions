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
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(curr!=null && curr.next!=null)
        {
            temp.next=new ListNode(curr.val);
            temp=temp.next;
            temp.next=new ListNode(gcd(curr.val,curr.next.val));
            temp=temp.next;
            curr=curr.next;
        }

        temp.next=new ListNode(curr.val);

        return dummy.next;
    }
}