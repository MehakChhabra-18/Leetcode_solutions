class Solution {
    public int minimumLength(String s) {
        int start=0,end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                char ch=s.charAt(start);
                while(start<=end && ch==s.charAt(start))
                {
                    start++;
                }

                while(start<=end && ch==s.charAt(end))
                {
                    end--;
                }
            }
            else break;
        }
        return end-start+1;
    }
}