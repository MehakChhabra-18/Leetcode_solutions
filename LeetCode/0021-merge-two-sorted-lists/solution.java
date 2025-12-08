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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1==null) return list2;
    if(list2==null) return list1;
     ListNode curr1=list1;
     while(curr1.next!=null) 
     {
        curr1=curr1.next;
     }
     curr1.next=list2;

    ListNode curr=list1;
    ListNode i,indx;
    for(i=curr;i!=null;i=i.next)
    {
        for(indx=i.next;indx!=null;indx=indx.next)
        {
            if(i.val>indx.val)
            {
                int temp=i.val;
                i.val=indx.val;
                indx.val=temp;
            }
        }
    }
return list1;

    }
}
