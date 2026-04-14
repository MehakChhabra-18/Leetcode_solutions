class Solution {
    public String decodeString(String s) {
        Stack<String> str=new Stack<>();
        Stack<Integer> number=new Stack<>();
        int num=0;
        for(char c: s.toCharArray())
        {
            
            if(Character.isDigit(c))
            {
                num=num*10+(c-'0');
            }
            else if(c=='[')
            {
                number.push(num);
                num=0;
                str.push("[");
            }
            else if(Character.isLetter(c))
            {
                str.push(c+"");
            }
            else 
            {
                StringBuilder ans=new StringBuilder();
                while(!str.isEmpty() && !str.peek().equals("["))
                {
                     ans.insert(0,str.pop());
                }
                str.pop();

                StringBuilder temp=new StringBuilder();
                int val=number.pop();
                for(int i=0;i<val;i++)
                {
                    temp.append(ans);
                }

                for(char ch:temp.toString().toCharArray())
                {
                    str.push(ch+"");
                }
            }
           
        }

        StringBuilder finalAns=new StringBuilder();
        while(!str.isEmpty())
        {
            finalAns.insert(0,str.pop());
        }
        return finalAns.toString();
        
    }
}
