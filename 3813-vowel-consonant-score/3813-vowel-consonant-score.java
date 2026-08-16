class Solution {
    public int vowelConsonantScore(String s) {
        int vowel=0,consonant=0;
        for(char c:s.toCharArray())
        {
            if(c=='a'|| c=='e'||c=='i' || c=='o'||c=='u')
            {
                vowel++;
            }
            else if(Character.isLetter(c))
            {
                consonant++;
            }
        }

        int floor=0;
        if(consonant>0)
        {
            floor=(int)Math.floor((double)vowel/consonant);
        }

        return floor;
        
    }
}