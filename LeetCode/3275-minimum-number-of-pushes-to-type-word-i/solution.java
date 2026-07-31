class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
       if(word.length()<=8) return n;
       else if(word.length()<=16) return 8+(n-8)*2;
       else if(word.length()<=24) return 8+16+(n-16)*3;
       else return 8+16+24+(n-24)*4;
       

    }
}
