class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                st.push(c);
            }
            else if(Character.isDigit(c))
            {
                while(!st.isEmpty() && !Character.isLetter(st.peek()))
                {
                    st.pop();
                }

                st.pop();
            }
        }

        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }

        ans=ans.reverse();
        return ans.toString();

    }
}