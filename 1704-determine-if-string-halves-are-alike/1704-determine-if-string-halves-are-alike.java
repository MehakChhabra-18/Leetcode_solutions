class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int n=s.length();
        String first=s.substring(0,n/2);
        String second=s.substring(n/2,n);
        int v1=0,v2=0;
        for(int i=0;i<first.length();i++)
        {
            char c=first.charAt(i);
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') v1++;
        }

        for(int i=0;i<second.length();i++)
        {
            char c=second.charAt(i);
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') v2++;
        }

        return v1==v2;

    }
}