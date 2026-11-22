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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        findPaths(root,targetSum,0L);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }

    public void findPaths(TreeNode root,int targetSum,long currSum)
    {
        if(root==null) return;
        currSum+=root.val;
        if(currSum==targetSum)
        {
            count++;
        }

        findPaths(root.left,targetSum,currSum);
        findPaths(root.right,targetSum,currSum);
    }
}