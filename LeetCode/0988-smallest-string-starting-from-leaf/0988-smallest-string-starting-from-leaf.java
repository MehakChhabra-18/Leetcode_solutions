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
    String ans=null;
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return ans;
    }

    public void dfs(TreeNode root,StringBuilder path)
    {
        if(root==null) return;
        path.append((char)('a'+root.val));
        if(root.right==null && root.left==null)
        {
            String current=new StringBuilder(path).reverse().toString();
            if(ans==null || current.compareTo(ans)<0)
            {
                ans=current;
            }
        }

        dfs(root.left,path);
        dfs(root.right,path);

        path.deleteCharAt(path.length()-1);
    }


}