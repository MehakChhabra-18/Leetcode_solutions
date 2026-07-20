class Solution {
    public boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] str=s.toCharArray();
        int start=0,end=str.length-1;
        while(start<end)
        {
            if(isVowel(str[start]) && isVowel(str[end]))
            {
                char temp=str[start];
                str[start]=str[end];
                str[end]=temp;
                start++;
                end--;
            }
            else if(isVowel(str[start]))
            {
                end--;
            }
            else if(isVowel(str[end]))
            {
                start++;
            }
            else
            {
                start++;
                end--;
            }
        }

        return new String(str);
        
    }
}
