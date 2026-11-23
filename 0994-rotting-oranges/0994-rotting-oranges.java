class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }

        int minutes=0;
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        while(!q.isEmpty() && fresh>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int[] curr=q.poll();
                int row=curr[0];
                int col=curr[1];
                for(int k=0;k<4;k++)
                {
                    int r=row+dx[k];
                    int c=col+dy[k];
                    if(r>=0 && r<m && c>=0 && c<n)
                    {
                        if(grid[r][c]==1)
                        {
                            fresh--;
                            grid[r][c]=2;
                            q.add(new int[]{r,c});
                        }
                    }
                }
            }
            minutes++;
        }

        if(fresh==0) return minutes;
        return -1;


    }
}