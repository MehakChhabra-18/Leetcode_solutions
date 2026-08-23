class Solution {
    public boolean isPalindromic(String s) {
        String finalAns="";
        for(char c:s.toCharArray())
            {
                String binary=
                    String.format("%8s",Integer.toBinaryString((int)c)).replace(' ','0');
                finalAns+=binary;
            }

        int left=0,right=finalAns.length()-1;
        while(left<right)
            {
                if(finalAns.charAt(left)!=finalAns.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
        return true;
        
    }
}