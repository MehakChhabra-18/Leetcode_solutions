class Solution {
    public int[] scoreValidator(String[] events) {
        int[] ans=new int[2];
        int score=0,counter=0;
        for(String event:events)
        {
            if(counter==10) break;
            if(event.equals("0")||event.equals("1")||event.equals("2")||event.equals("3")||event.equals("4")||event.equals("5")||event.equals("6"))
            {
                score+=Integer.valueOf(event);
            }
            else if(event.equals("W"))
            {
                counter++;
            }
            else if(event.equals("WD") || event.equals("NB"))
            {
                score+=1;
            }
        }

        ans[0]=score;
        ans[1]=counter;
        return ans;

    }
}