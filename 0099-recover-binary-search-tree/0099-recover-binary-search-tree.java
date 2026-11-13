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
    ArrayList<TreeNode> list = new ArrayList<>();
    public void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {

        inorder(root);
        ArrayList<Integer> sorted = new ArrayList<>();
        for (TreeNode node : list) {
            sorted.add(node.val);
        }
        Collections.sort(sorted);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).val != sorted.get(i)) {
                list.get(i).val = sorted.get(i);
            }
        }
    }
}
