class Solution {
    public int earliestTime(int[][] tasks) {
        int finalAns=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++)
        {
            int sum=0;
            for(int j=0;j<tasks[0].length;j++)
            {
                sum+=tasks[i][j];
            }

            finalAns=Math.min(finalAns,sum);
        }

        return finalAns;
    }
}