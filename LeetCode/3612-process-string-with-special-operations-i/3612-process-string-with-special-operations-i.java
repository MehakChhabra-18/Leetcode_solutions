class Solution {
    public String processStr(String s) {
        StringBuilder result=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                result.append(c);
            }

            else
            {
                switch(c)
                {
                    case '#':
                    {
                        result.append(result);
                        break;
                    }

                    case '%':
                    {
                        result.reverse();
                        break;
                    }

                    case '*':
                    {
                        if(result.length()>=1) result.deleteCharAt(result.length() - 1);
                        break;
                    }
                }
            } 
        }

        return result.toString();
    }
}