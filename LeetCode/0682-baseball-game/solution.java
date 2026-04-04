class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            String s=operations[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+"))
            {
                int top=st.pop();
                int top2=st.peek();
                int val=top+top2;
                st.push(top);
                st.push(val);
            }
            else
            {
                st.push(Integer.parseInt(s));
            }
        }

        int sum=0;
        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        return sum;
        
    }
}
