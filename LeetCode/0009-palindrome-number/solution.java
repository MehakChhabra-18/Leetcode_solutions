class Solution {
    public boolean isPalindrome(int x) {
       String str = Integer.toString(x);
       int len =str.length();
       String reverse="";
       for(int i=len-1;i>=0;i--)
       {
        reverse+=str.charAt(i);
       }
       if(reverse.equals(str))
       {
        return true;
       }
       return false;
}
}
