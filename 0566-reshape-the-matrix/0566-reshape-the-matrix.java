class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if(row==r && col==c) return mat;
        if(row*col!=r*c) return mat;
        int[][] newMat=new int[r][c];
        int newRow=0,newCol=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                newMat[newRow][newCol]=mat[i][j];
                newCol++;
                if(newCol==c)
                {
                    newCol=0;
                    newRow++;
                }
            }
        }

        return newMat;
    }
}