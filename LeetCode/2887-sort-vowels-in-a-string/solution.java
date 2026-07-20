class Solution {

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String sortVowels(String s) {

        List<Character> vowels = new ArrayList<>();

        for(char c : s.toCharArray()) {
            if(isVowel(c))
                vowels.add(c);
        }

        Collections.sort(vowels);

        char[] ans = s.toCharArray();
        int j = 0;

        for(int i = 0; i < ans.length; i++) {
            if(isVowel(ans[i])) {
                ans[i] = vowels.get(j++);
            }
        }

        return new String(ans);
    }
}
