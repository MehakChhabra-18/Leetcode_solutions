/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int ans = 0;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return ans;
    }

    public void dfs(TreeNode root, int minVal, int maxVal) {
        if (root == null) return;
        ans = Math.max(ans, Math.max(
            Math.abs(root.val - minVal),
            Math.abs(root.val - maxVal)
        ));
        minVal = Math.min(minVal, root.val);
        maxVal = Math.max(maxVal, root.val);

        dfs(root.left, minVal, maxVal);
        dfs(root.right, minVal, maxVal);
    }
}
