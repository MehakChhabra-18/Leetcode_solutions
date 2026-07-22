class Solution {
    public String removeStars(String s) {
        Stack<Character> nonStar=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='*')
            {
                nonStar.pop();
            }
            else
            {
                nonStar.push(c);
            }
        }

        StringBuilder ans=new StringBuilder();
        while(!nonStar.isEmpty())
        {
            ans.append(nonStar.pop());
        }
        return ans.reverse().toString();
        
    }
}
