class Solution {
    public int lengthOfLastWord(String s) {

        String[] words=s.split(" ");
        String result=words[words.length-1];
        return result.length();
        
    }
}
