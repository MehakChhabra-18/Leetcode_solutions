
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int m = mat.length;
        int n = mat[0].length;

        // Group elements according to diagonal sum
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                int sum = i + j;

                map.putIfAbsent(sum, new ArrayList<>());

                map.get(sum).add(mat[i][j]);
            }
        }

        // Store diagonal traversal
        int[] ans = new int[m * n];
        int index = 0;

        // Total number of diagonals = m + n - 1
        for(int i = 0; i < m + n - 1; i++) {

            ArrayList<Integer> list = map.get(i);

            if(i % 2 == 0) {

                // Even diagonal: Reverse order
                for(int j = list.size() - 1; j >= 0; j--) {
                    ans[index++] = list.get(j);
                }
            }
            else {

                // Odd diagonal: Normal order
                for(int j = 0; j < list.size(); j++) {
                    ans[index++] = list.get(j);
                }
            }
        }

        return ans;
    }
}
