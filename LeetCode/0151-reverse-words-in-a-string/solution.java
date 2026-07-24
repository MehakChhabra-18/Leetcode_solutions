class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            String str=arr[i];
            if(i>0)
            {
                result.append(str+" ");
            }
            else
            {
                result.append(str);
            }      
        }

        return result.toString();
        
    }
}
