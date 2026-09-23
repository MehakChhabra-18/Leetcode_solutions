class Solution {
    public int percentageLetter(String s, char letter) {
        int find=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter)
            {
                find++;
            }
        }

        return (find*100)/s.length();
    }
}