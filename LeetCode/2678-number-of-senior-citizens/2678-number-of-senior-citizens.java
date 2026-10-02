class Solution {
    public int countSeniors(String[] details) {

        int n=15;
        int count=0;
        for(String s:details)
        {
            String age=s.substring(11,13);
            if(Integer.valueOf(age)>60)
            {
                count++;
            }
        }

        return count;
    }
}