class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String[] words=s.split("\\s+");
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            for(int j=word.length()-1;j>=0;j--)
            {
                ans.append(word.charAt(j));
            }
            if(i!=words.length-1)
            {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}