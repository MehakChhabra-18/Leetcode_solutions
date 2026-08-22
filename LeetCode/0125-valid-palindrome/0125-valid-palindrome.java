class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                ans+=Character.toLowerCase(c);
            }
        }

        int left=0,right=ans.length()-1;
        while(left<right)
        {
            if(ans.charAt(left)!=ans.charAt(right))
            {
                return false;
            }

            left++;
            right--;
        }

        return true;
        
    }
}