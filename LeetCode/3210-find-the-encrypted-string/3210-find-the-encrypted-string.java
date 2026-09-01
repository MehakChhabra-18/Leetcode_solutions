class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int index=i+k;
            if(index>=n) index=index%n;
            ans.append(s.charAt(index));
        }

        return ans.toString();
    }
}