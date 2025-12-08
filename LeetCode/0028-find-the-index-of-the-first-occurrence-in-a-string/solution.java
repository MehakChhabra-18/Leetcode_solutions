class Solution {
    public int strStr(String haystack, String needle) {
        
       if(!haystack.contains(needle))
       {
        return -1;
       }
       int idx=-1;
      
       for(int i=0;i<haystack.length();i++)
       {
         boolean found=true;
        for(int j=0;j<needle.length();j++)
        {
            if(haystack.charAt(i+j)!=needle.charAt(j))
            {
                found =false;
                break;
            }
        }

         if(found)
       {
        idx=i;
        break;
       }
       }
return idx;

      
    }
}
