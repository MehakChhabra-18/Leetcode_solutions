class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int vowel=0,consonant=0;
        for(char c:word.toCharArray())
        {
            if(!Character.isLetterOrDigit(c))
            {
                return false;
            }
            
           if("aeiouAEIOU".indexOf(c) != -1) {
                vowel++;
            }
            else if(Character.isLetter(c)) {
                consonant++;
            }
        }

        if(vowel>=1 && consonant>=1) return true;
        return false;
    }
}