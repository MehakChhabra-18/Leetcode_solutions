class Solution {
    public void gameOfLife(int[][] board) {
        int r=board.length;
        int c=board[0].length;
        int[][] temp=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                temp[i][j]=board[i][j];
            }
        }

        int[] dx={-1,-1,-1,0,0,1,1,1};
        int[] dy={-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int count=0;
                for(int k=0;k<8;k++)
                {
                    int row=i+dx[k];
                    int col=j+dy[k];
                    if(row>=0 && row<r && col>=0 && col<c)
                    {
                        if(temp[row][col]==1)
                        {
                            count++;
                        }
                    }
                }

                if(temp[i][j]==1)
                {
                    if(count<2 || count>3)
                    {
                        board[i][j]=0;
                    }
                }
                else
                {
                    if(count==3)
                    {
                        board[i][j]=1;
                    }
                }
            }
        }
    }
}