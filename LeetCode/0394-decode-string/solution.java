class Solution {
    public String decodeString(String s) {
        Stack<String> str=new Stack<>();
        Stack<Integer> number=new Stack<>();
        int num=0;
        String curr="";
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                num=num*10+(c-'0');
            }
            else if(c=='[')
            {
                str.push(curr);
                number.push(num);
                num=0;
                curr="";
            }
            else if(c==']')
            {
                String temp="";
                String prev=str.pop();
                 int val=number.pop();
                 for(int i=0;i<val;i++)
                 {
                    temp+=curr;
                 }
                 curr=prev+temp;
            }
            else
            {
                curr+=c;
            }
        }
        return curr;
        
    }
}
