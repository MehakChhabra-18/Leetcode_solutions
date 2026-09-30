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
    public ListNode mergeNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val!=0)
            {
                st.push(curr.val);
            }
            else
            {
                int sum=0;
                while(st.size()>0 && st.peek()!=0)
                {
                    sum+=st.pop();
                }
                
                if(sum!=0) st.push(sum);
                st.push(0);

            }

            curr=curr.next;
        }

        ArrayList<Integer> list=new ArrayList<>();
        while(!st.isEmpty())
        {
            list.add(st.pop());
        }

        Collections.reverse(list);

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==0) continue;
            else
            {
                temp.next=new ListNode(list.get(i));
                temp=temp.next;
            }
        }
        return dummy.next;
        
    }
}