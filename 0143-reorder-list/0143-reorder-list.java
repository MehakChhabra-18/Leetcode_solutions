class Solution {
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null)
            return;

        ListNode firstHalf = head;
        ListNode slow = head;
        ListNode fast = head;
    
        // Find middle
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode SecondHalf = reverse(slow.next);
        slow.next=null;

        // Merge
        while(firstHalf != null && SecondHalf != null)
        {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = SecondHalf.next;

            firstHalf.next = SecondHalf;
            SecondHalf.next = temp1;

            firstHalf = temp1;
            SecondHalf = temp2;
        }
    }
}