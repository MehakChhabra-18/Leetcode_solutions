class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen=new boolean[26];
        for(char c:sentence.toCharArray())
        {
            seen[c-'a']=true;
        }

        for(boolean found:seen)
        {
            if(found==false) return false;
        }

        return true;
    }
}