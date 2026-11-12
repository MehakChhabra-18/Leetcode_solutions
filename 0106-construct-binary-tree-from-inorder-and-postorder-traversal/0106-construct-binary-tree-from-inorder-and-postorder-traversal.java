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
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex=postorder.length-1;
        return solve(inorder,postorder,0,inorder.length-1);
    }

    public TreeNode solve(int[] inorder,int[] postorder,int start,int end)
    {
        if(start>end || postIndex<0) return null;
        int val=postorder[postIndex--];
        TreeNode root=new TreeNode(val);
        int i=start;
        while(i<=end && inorder[i]!=val)
        {
            i++;
        }
        root.right=solve(inorder,postorder,i+1,end);
        root.left=solve(inorder,postorder,start,i-1);
        return root;
    }
}