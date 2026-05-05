class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        // If left is null → go right only
        if (root.left == null) 
            return 1 + minDepth(root.right);

        // If right is null → go left only
        if (root.right == null) 
            return 1 + minDepth(root.left);

        // If both exist → take minimum
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
