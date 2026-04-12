class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Step 1: make first column all 1
        for(int i = 0; i < rows; i++) {
            if(grid[i][0] == 0) {
                for(int j = 0; j < cols; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        
        int result=0;
        for(int j=0;j<cols;j++)
        {
            int count1=0;
            for(int i=0;i<rows;i++)
            {
                if(grid[i][j]==1) count1++;
            }
            int maxOnes=Math.max(count1,rows-count1);
            result+=maxOnes*(1<<(cols-j-1));
        }
        return result;
    }
}
