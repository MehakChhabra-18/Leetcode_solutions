class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        // Count ones in every row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int zerosRow = n - row[i];
                int zerosCol = m - col[j];

                ans[i][j] =
                    row[i] + col[j]
                    - zerosRow - zerosCol;
            }
        }

        return ans;
    }
}