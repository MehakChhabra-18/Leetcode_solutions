class Solution {
    public int minSwaps(String s) {
        int open=0,close=0;
        for(char c:s.toCharArray())
        {
            if(c=='[') open++;
            else
            {
                if(open>0) open--;
                else close++;
            }
        }

        return (Math.max(open, close) + 1) / 2;
    }
}