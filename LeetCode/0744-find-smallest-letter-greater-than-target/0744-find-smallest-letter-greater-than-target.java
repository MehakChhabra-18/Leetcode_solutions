class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char minChar='{';     // z se just bda character
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
            {
                if(letters[i]<minChar) minChar=letters[i];
            }
        }

        if(minChar=='{') return letters[0];
        return minChar;
    }
}