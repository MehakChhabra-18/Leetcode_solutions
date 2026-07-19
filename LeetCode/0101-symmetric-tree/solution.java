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
    public boolean isSymmetric(TreeNode root) {
        mirror(root.left);
        return isIdentical(root.left,root.right);        
    }

    public void mirror(TreeNode root)
    {
        if(root==null) return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }

    public boolean isIdentical(TreeNode t1,TreeNode t2)
    {
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null || t1.val !=t2.val) return false;
        return isIdentical(t1.left,t2.left) && isIdentical(t1.right,t2.right);
    }
}
