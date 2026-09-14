class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans=new StringBuilder(s);
        int n=part.length();
        int idx=ans.indexOf(part);
        while(idx!=-1)
        {
            ans.delete(idx,idx+n);
            idx=ans.indexOf(part);
        }

        return ans.toString();
        
    }
}