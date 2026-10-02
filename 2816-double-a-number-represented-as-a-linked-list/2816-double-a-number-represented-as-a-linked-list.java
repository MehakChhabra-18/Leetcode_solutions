import java.math.BigInteger;

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

    public ListNode doubleIt(ListNode head) {

        String str = "";

        ListNode curr = head;

        while(curr != null)
        {
            str += curr.val;
            curr = curr.next;
        }

        BigInteger number = new BigInteger(str);

        number = number.multiply(BigInteger.valueOf(2));

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        String result = number.toString();

        for(int i = result.length() - 1; i >= 0; i--)
        {
            int digit = result.charAt(i) - '0';

            temp.next = new ListNode(digit);
            temp = temp.next;
        }

        return reverse(dummy.next);
    }
}