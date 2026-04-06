class Solution {
    public int evalRPN(String[] tokens) {
        StringBuilder res=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        for(String token: tokens)
        {
             if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))
             {
                int val2=st.pop();
                int val1=st.pop();
                switch(token)
                {
                    case "+": st.push(val1+val2); break;
                    case "-": st.push(val1-val2); break;
                    case "*": st.push(val1*val2); break;
                    case "/": st.push(val1/val2); break;
                }
             }
             else
             {
                st.push(Integer.parseInt(token));
             }
        }
        return st.pop();
        
    }
}
