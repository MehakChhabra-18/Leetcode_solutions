class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int row=n;
        int col=n;
        int top=0,bottom=row-1;
        int left=0,right=col-1;
        int val=1;
        while(top<=bottom && left<=right && val<=n*n)
        {
            //left->right
            for(int i=left;i<=right;i++)
            {
                matrix[top][i]=val;
                val++;
            }
            top++;

            //top->bottom
            for(int i=top;i<=bottom;i++)
            {
                matrix[i][right]=val;
                val++;
            }
            right--;

            //right->left
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    matrix[bottom][i]=val;
                    val++;
                }
                bottom--;
            }

            //bottom->top
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    matrix[i][left]=val;
                    val++;
                }
                left++;
            }
        }

        return matrix;
    }
}