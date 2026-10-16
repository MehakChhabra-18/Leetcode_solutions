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
    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return makeBST(list, 0, list.size() - 1);
    }

    public TreeNode makeBST(ArrayList<Integer> list, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = makeBST(list, l, mid - 1);
        root.right = makeBST(list, mid + 1, r);

        return root;
    }
}