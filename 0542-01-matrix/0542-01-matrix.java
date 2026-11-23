class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(ans[i],-1);
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    ans[i][j]=0;
                    q.add(new int[]{i,j});
                }
            }
        }

        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        while(!q.isEmpty())
        {
            int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            for(int k=0;k<4;k++)
            {
                int r=row+dx[k];
                int c=col+dy[k];
                if(r>=0 && r<m && c>=0 && c<n && ans[r][c]==-1)
                {
                    ans[r][c]=ans[row][col]+1;
                    q.add(new int[]{r,c});
                }
            }
        }
        return ans;
    }
}