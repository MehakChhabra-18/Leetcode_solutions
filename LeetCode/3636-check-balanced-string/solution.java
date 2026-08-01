class Solution {
    public boolean isBalanced(String num) {
        int sum_even=0,sum_odd=0;
        for(int i=0;i<num.length();i++)
        {
            char c=num.charAt(i);
            int val=c-'0';
            if(i%2==0)
            {
                sum_even+=val;
            }
            else
            {
                sum_odd+=val;
            }
        }

        if(sum_even==sum_odd) return true;
        return false;
        
    }
}
