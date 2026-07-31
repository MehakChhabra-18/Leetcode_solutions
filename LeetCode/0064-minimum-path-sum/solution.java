class Solution {

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(grid, 0, 0, dp);
    }

    private int solve(int[][] grid, int i, int j, int[][] dp) {

        // Out of bounds
        if (i >= grid.length || j >= grid[0].length) {
            return Integer.MAX_VALUE;
        }

        // Destination reached
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int right = solve(grid, i, j + 1, dp);
        int down = solve(grid, i + 1, j, dp);

        dp[i][j] = grid[i][j] + Math.min(right, down);

        return dp[i][j];
    }
}
